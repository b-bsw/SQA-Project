package org.apache.commons.math3.fraction;

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
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 60);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(140);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str8 = fraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        int int14 = fraction7.compareTo(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.divide(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction1.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(200, (int) (short) 3);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.multiply(fraction23);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 4" + "'", str8, "1 / 4");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 10.0f);
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        int int3 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add(0);
        float float12 = fraction9.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.5f) + "'", float12 == (-0.5f));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 100, (int) (byte) -52);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-25 / 13" + "'", str3, "-25 / 13");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0.3333333333333333d);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add((int) (byte) 0);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.multiply(fraction14);
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.divide(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction15.add(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.abs();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int30 = fraction29.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction34 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long35 = fraction34.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField36 = fraction34.getField();
        long long37 = fraction34.longValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction31.divide(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction28.add(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction28.abs();
        int int41 = fraction23.compareTo(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction40.negate();
        long long43 = fraction40.longValue();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction40.subtract((-195137));
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction45.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(fractionField36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(305, 31);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str5 = fraction4.toString();
        double double6 = fraction4.percentageValue();
        int int7 = fraction0.compareTo(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double9 = fraction8.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.multiply(fraction15);
        float float17 = fraction4.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction4.abs();
        int int19 = fraction18.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 2" + "'", str5, "1 / 2");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction(35);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.add(101);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.subtract(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 3L);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply(1);
        double double8 = fraction7.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.multiply((int) 'a');
        float float17 = fraction14.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction7.add(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE;
        java.lang.String str21 = fraction20.toString();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.divide((int) (byte) 75);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction14.subtract(fraction24);
        int int26 = fraction14.getDenominator();
        float float27 = fraction14.floatValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-5.0f) + "'", float17 == (-5.0f));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-5.0f) + "'", float27 == (-5.0f));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-4.142857142857143d));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.multiply(fraction4);
        byte byte8 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 33);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.reciprocal();
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.divide(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        boolean boolean10 = fraction5.equals((java.lang.Object) fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction11.getField();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.subtract(fraction11);
        int int14 = fraction8.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.abs();
        boolean boolean16 = fraction4.equals((java.lang.Object) fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.abs();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long28 = fraction27.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField29 = fraction27.getField();
        long long30 = fraction27.longValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction24.divide(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction21.add(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction21.abs();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int35 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction41.negate();
        org.apache.commons.math3.fraction.Fraction fraction44 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long45 = fraction44.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField46 = fraction44.getField();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction44.abs();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction47.abs();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction47.multiply((int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction47.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction42.multiply(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction21.divide(fraction52);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction52.multiply((-101));
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction15.subtract(fraction52);
        org.apache.commons.math3.fraction.Fraction fraction59 = new org.apache.commons.math3.fraction.Fraction(60, (-1));
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction59.negate();
        org.apache.commons.math3.fraction.Fraction fraction61 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction64 = new org.apache.commons.math3.fraction.Fraction(35, 10);
        int int65 = fraction61.compareTo(fraction64);
        int int66 = fraction60.compareTo(fraction64);
        org.apache.commons.math3.fraction.Fraction fraction69 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction70 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str71 = fraction70.toString();
        org.apache.commons.math3.fraction.Fraction fraction73 = fraction70.multiply((int) ' ');
        java.lang.String str74 = fraction70.toString();
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction69.multiply(fraction70);
        org.apache.commons.math3.fraction.Fraction fraction77 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction78 = fraction77.abs();
        double double79 = fraction78.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction80 = fraction70.add(fraction78);
        org.apache.commons.math3.fraction.Fraction fraction81 = fraction64.add(fraction80);
        int int82 = fraction81.intValue();
        org.apache.commons.math3.fraction.Fraction fraction83 = fraction52.subtract(fraction81);
        org.apache.commons.math3.fraction.Fraction fraction85 = fraction52.divide((int) (byte) -35);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(fractionField29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
        org.junit.Assert.assertNotNull(fractionField46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1 / 4" + "'", str71, "1 / 4");
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "1 / 4" + "'", str74, "1 / 4");
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 13 + "'", int82 == 13);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction85);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add((int) (byte) -100);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(350, (int) (byte) 75);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(51);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double4 = fraction3.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int14 = fraction13.getNumerator();
        long long15 = fraction13.longValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction9.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction3.subtract(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction13.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        double double21 = fraction20.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply((int) (byte) 20);
        org.apache.commons.math3.fraction.Fraction fraction26 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.reciprocal();
        boolean boolean29 = fraction26.equals((java.lang.Object) 800.0d);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction23.subtract(fraction26);
        java.lang.String str31 = fraction23.toString();
        int int32 = fraction23.getDenominator();
        boolean boolean33 = fraction1.equals((java.lang.Object) fraction23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "20" + "'", str31, "20");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction1.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.multiply(401);
        int int12 = fraction11.getNumerator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10025 + "'", int12 == 10025);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        double double4 = fraction0.doubleValue();
        long long5 = fraction0.longValue();
        java.lang.String str6 = fraction0.toString();
        double double7 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction12.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int21 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction16.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField29 = fraction28.getField();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction27.divide(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction16.divide(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction27.multiply(99);
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction41 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10, 35);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction38.divide(fraction41);
        int int43 = fraction41.getNumerator();
        int int44 = fraction27.compareTo(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction0.add(fraction41);
        java.lang.String str46 = fraction45.toString();
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double48 = fraction47.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str50 = fraction49.toString();
        org.apache.commons.math3.fraction.FractionField fractionField51 = fraction49.getField();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction47.multiply(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction52.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str56 = fraction55.toString();
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int58 = fraction57.intValue();
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction57.multiply(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction60.negate();
        int int62 = fraction55.compareTo(fraction61);
        float float63 = fraction55.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField64 = fraction55.getField();
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction52.subtract(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction65.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction65.abs();
        org.apache.commons.math3.fraction.Fraction fraction69 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 8);
        int int70 = fraction67.compareTo(fraction69);
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction45.subtract(fraction69);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25d + "'", double4 == 0.25d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 4" + "'", str11, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fractionField29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "15 / 28" + "'", str46, "15 / 28");
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1 / 2" + "'", str50, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1 / 4" + "'", str56, "1 / 4");
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.25f + "'", float63 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(fraction71);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) (-59.985577f), (int) (short) 300);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.add(fraction5);
        double double7 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.2d) + "'", double7 == (-0.2d));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long15 = fraction14.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction11.add(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.abs();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction23.abs();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction10.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str28 = fraction27.toString();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.add(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction20.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str32 = fraction31.toString();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction20.add(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction16.divide(fraction31);
        double double37 = fraction16.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1 / 2" + "'", str28, "1 / 2");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1 / 4" + "'", str32, "1 / 4");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(259);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.subtract((int) (short) 24);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-59));
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add((int) '#');
        boolean boolean7 = fraction2.equals((java.lang.Object) fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction2.multiply(fraction8);
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction8.getField();
        int int13 = fraction8.getNumerator();
        float float14 = fraction8.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction1.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.abs();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.divide(99);
        int int22 = fraction21.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction8.add(fraction21);
        double double24 = fraction21.percentageValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4950 + "'", int22 == 4950);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.020202020202020204d + "'", double24 == 0.020202020202020204d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add(0);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.abs();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long18 = fraction17.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction17.getField();
        long long20 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction11.add(fraction14);
        int int23 = fraction14.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction14.add((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction6.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction14.add((int) (byte) 58);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction14.abs();
        long long30 = fraction14.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.add((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        double double14 = fraction13.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction19.add((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.negate();
        double double30 = fraction29.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction23.add(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction29.divide((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction13.divide(fraction33);
        int int35 = fraction13.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 / 4" + "'", str17, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 602);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        double double15 = fraction14.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.subtract((int) (short) 35);
        double double21 = fraction18.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.add((int) '#');
        boolean boolean27 = fraction22.equals((java.lang.Object) fraction24);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str29 = fraction28.toString();
        org.apache.commons.math3.fraction.FractionField fractionField30 = fraction28.getField();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction22.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction18.add(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction14.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction9.add(fraction18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0309278350515463d) + "'", double15 == (-1.0309278350515463d));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1 / 2" + "'", str29, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract((int) (short) 0);
        boolean boolean9 = fraction0.equals((java.lang.Object) fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.abs();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction11.subtract(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        int int24 = fraction21.compareTo(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction10.divide(fraction21);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.14285714285714285d, 3);
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.negate();
        int int15 = fraction8.compareTo(fraction14);
        float float16 = fraction8.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction8.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 100, (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.negate();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.negate();
        boolean boolean29 = fraction22.equals((java.lang.Object) fraction26);
        boolean boolean30 = fraction19.equals((java.lang.Object) fraction22);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction19.subtract((int) (short) 2);
        java.lang.String str33 = fraction32.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.25f + "'", float16 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2" + "'", str33, "2");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-1.3333333333333333d));
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply((int) (short) -802);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        java.lang.String str13 = fraction2.toString();
        float float14 = fraction2.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3 / 5" + "'", str13, "3 / 5");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.6f + "'", float14 == 0.6f);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        java.lang.String str6 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((double) 3L);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction2.subtract(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long19 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.subtract(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction15.add(fraction25);
        long long27 = fraction15.longValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction15.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.add(75);
        int int32 = fraction14.compareTo(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply((int) (byte) -10);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3 / 5" + "'", str6, "3 / 5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        int int8 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.add(10);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.add((int) '#');
        boolean boolean16 = fraction11.equals((java.lang.Object) fraction13);
        java.lang.String str17 = fraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction10.multiply(fraction13);
        int int19 = fraction5.compareTo(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((double) 101.0f, (double) 'a', (int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.add(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, 50);
        org.apache.commons.math3.fraction.FractionField fractionField28 = fraction27.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction18.add(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3 / 5" + "'", str17, "3 / 5");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double3 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        int int17 = fraction10.compareTo(fraction16);
        float float18 = fraction10.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction7.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.abs();
        int int23 = fraction22.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction0.divide(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction0.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 2" + "'", str5, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 4" + "'", str11, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.25f + "'", float18 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-9.0d));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(10033.333333333334d, (int) (byte) -1);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract(fraction5);
        int int8 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction1.add(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction3.subtract((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.divide(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int21 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction20.subtract(fraction22);
        int int25 = fraction20.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.abs();
        boolean boolean27 = fraction19.equals((java.lang.Object) fraction26);
        java.lang.String str28 = fraction26.toString();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.abs();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 4" + "'", str23, "1 / 4");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1 / 4" + "'", str28, "1 / 4");
        org.junit.Assert.assertNotNull(fraction29);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction5.subtract(fraction6);
        int int11 = fraction10.getNumerator();
        int int12 = fraction10.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long17 = fraction16.longValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str21 = fraction20.toString();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction18.subtract(fraction20);
        int int23 = fraction18.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction18.divide(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction16.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction18.subtract((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.divide(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.subtract((int) (byte) 32);
        boolean boolean37 = fraction13.equals((java.lang.Object) fraction36);
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str39 = fraction38.toString();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction38.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction41.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int45 = fraction44.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction44.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction41.subtract(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str50 = fraction49.toString();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int52 = fraction51.intValue();
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction51.multiply(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction54.negate();
        int int56 = fraction49.compareTo(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction55.multiply((int) (byte) 1);
        int int59 = fraction55.intValue();
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction41.subtract(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction61 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int62 = fraction61.intValue();
        org.apache.commons.math3.fraction.Fraction fraction63 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction63.add((int) '#');
        boolean boolean66 = fraction61.equals((java.lang.Object) fraction63);
        org.apache.commons.math3.fraction.Fraction fraction67 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int68 = fraction67.intValue();
        org.apache.commons.math3.fraction.Fraction fraction69 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction67.multiply(fraction69);
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction67.abs();
        org.apache.commons.math3.fraction.Fraction fraction72 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int73 = fraction72.intValue();
        org.apache.commons.math3.fraction.Fraction fraction74 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction72.multiply(fraction74);
        org.apache.commons.math3.fraction.Fraction fraction77 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long78 = fraction77.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField79 = fraction77.getField();
        long long80 = fraction77.longValue();
        org.apache.commons.math3.fraction.Fraction fraction81 = fraction74.divide(fraction77);
        org.apache.commons.math3.fraction.Fraction fraction82 = fraction71.add(fraction74);
        org.apache.commons.math3.fraction.Fraction fraction83 = fraction63.add(fraction71);
        org.apache.commons.math3.fraction.Fraction fraction84 = fraction55.divide(fraction83);
        org.apache.commons.math3.fraction.Fraction fraction85 = fraction13.divide(fraction83);
        int int86 = fraction10.compareTo(fraction83);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 / 4" + "'", str21, "1 / 4");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1 / 4" + "'", str39, "1 / 4");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1 / 4" + "'", str50, "1 / 4");
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 100L + "'", long78 == 100L);
        org.junit.Assert.assertNotNull(fractionField79);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 100L + "'", long80 == 100L);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction4.add(5);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.divide(103);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction1.add(fraction12);
        double double17 = fraction1.percentageValue();
        float float18 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction(35);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        boolean boolean12 = fraction7.equals((java.lang.Object) fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.negate();
        int int20 = fraction13.compareTo(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction7.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply((int) (short) 100);
        long long28 = fraction27.longValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction19.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction32.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.subtract(3);
        boolean boolean39 = fraction19.equals((java.lang.Object) fraction36);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction6.divide(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction2.multiply(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction41.subtract((int) (short) -50);
        double double44 = fraction43.percentageValue();
        float float45 = fraction43.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 / 4" + "'", str14, "1 / 4");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 4" + "'", str23, "1 / 4");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 800L + "'", long28 == 800L);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 5262.5d + "'", double44 == 5262.5d);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 52.625f + "'", float45 == 52.625f);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 20, 800);
        int int3 = fraction2.getDenominator();
        double double4 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40 + "'", int3 == 40);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.025d + "'", double4 == 0.025d);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(35);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction5);
        boolean boolean7 = fraction2.equals((java.lang.Object) fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.negate();
        int int15 = fraction8.compareTo(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction2.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.multiply((int) (short) 100);
        long long23 = fraction22.longValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction14.subtract(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction27.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.subtract(3);
        boolean boolean34 = fraction14.equals((java.lang.Object) fraction31);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction1.divide(fraction31);
        int int36 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.add((int) '#');
        boolean boolean42 = fraction37.equals((java.lang.Object) fraction39);
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str44 = fraction43.toString();
        org.apache.commons.math3.fraction.FractionField fractionField45 = fraction43.getField();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction37.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction46.abs();
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction47.divide((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction1.multiply(fraction49);
        byte byte51 = fraction49.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 800L + "'", long23 == 800L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1 / 2" + "'", str44, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 0 + "'", byte51 == (byte) 0);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        int int6 = fraction2.compareTo(fraction5);
        int int7 = fraction5.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.negate();
        int int15 = fraction8.compareTo(fraction14);
        float float16 = fraction8.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.abs();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.negate();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction33.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction25.multiply(fraction35);
        org.apache.commons.math3.fraction.FractionField fractionField37 = fraction36.getField();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField40 = fraction39.getField();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction39.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction38.subtract(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction46 = new org.apache.commons.math3.fraction.Fraction(60, (-1));
        double double47 = fraction46.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction42.add(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction48.add(1);
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double52 = fraction51.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str54 = fraction53.toString();
        org.apache.commons.math3.fraction.FractionField fractionField55 = fraction53.getField();
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction51.multiply(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction56.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int60 = fraction59.intValue();
        org.apache.commons.math3.fraction.Fraction fraction61 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction59.multiply(fraction61);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction62.negate();
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction62.negate();
        org.apache.commons.math3.fraction.Fraction fraction65 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int66 = fraction65.intValue();
        org.apache.commons.math3.fraction.Fraction fraction67 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction65.multiply(fraction67);
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction68.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction70.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction73 = fraction62.multiply(fraction72);
        org.apache.commons.math3.fraction.Fraction fraction74 = fraction58.subtract(fraction73);
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction58.abs();
        org.apache.commons.math3.fraction.Fraction fraction76 = fraction48.add(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction77 = fraction76.negate();
        double double78 = fraction76.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction79 = fraction21.add(fraction76);
        org.apache.commons.math3.fraction.Fraction fraction81 = fraction79.add((int) (short) -198);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.25f + "'", float16 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fractionField37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fractionField40);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-60.0d) + "'", double47 == (-60.0d));
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1 / 2" + "'", str54, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-59.86057692307692d) + "'", double78 == (-59.86057692307692d));
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction81);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction12.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply((int) ' ');
        java.lang.String str23 = fraction19.toString();
        boolean boolean24 = fraction15.equals((java.lang.Object) fraction19);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str28 = fraction27.toString();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int31 = fraction30.intValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction33.negate();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction33.negate();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction29.subtract(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.ONE;
        int int38 = fraction37.intValue();
        boolean boolean39 = fraction29.equals((java.lang.Object) int38);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction29.negate();
        boolean boolean41 = fraction15.equals((java.lang.Object) fraction40);
        float float42 = fraction40.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 / 4" + "'", str20, "1 / 4");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 4" + "'", str23, "1 / 4");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1 / 4" + "'", str28, "1 / 4");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.divide(200);
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction11.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide((int) (short) -802);
        long long20 = fraction17.longValue();
        java.lang.String str21 = fraction17.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1" + "'", str21, "-1");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(133.33333333333334d, (int) (byte) -5);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long4 = fraction3.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.add(fraction10);
        long long12 = fraction0.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction(51);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        int int18 = fraction14.compareTo(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction0.add(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int22 = fraction21.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction20.multiply(fraction24);
        int int26 = fraction24.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction31.reciprocal();
        int int33 = fraction32.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction24.add(fraction32);
        int int35 = fraction0.compareTo(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction32.multiply(9);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction32.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.multiply(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction43 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long44 = fraction43.longValue();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction43.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction48 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean49 = fraction43.equals((java.lang.Object) fraction48);
        float float50 = fraction43.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction40.divide(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction53 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long54 = fraction53.longValue();
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction53.multiply(fraction55);
        int int57 = fraction56.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction61 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double62 = fraction61.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction56.divide(fraction61);
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction56.multiply((int) (short) -100);
        double double66 = fraction65.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction40.multiply(fraction65);
        int int68 = fraction32.compareTo(fraction67);
        org.apache.commons.math3.fraction.Fraction fraction71 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-501), (-75));
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction67.multiply(fraction71);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 100.0f + "'", float50 == 100.0f);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 100L + "'", long54 == 100L);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 7500.0d + "'", double62 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1000000.0d + "'", double66 == 1000000.0d);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(5);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long12 = fraction11.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction11.getField();
        long long14 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.divide(fraction11);
        int int16 = fraction15.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction15.subtract(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction29 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double30 = fraction29.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction25.subtract(fraction29);
        int int32 = fraction31.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction35 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f, (int) (short) 10);
        boolean boolean36 = fraction31.equals((java.lang.Object) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction5.add(fraction31);
        long long38 = fraction37.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7500.0d + "'", double30 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-195137) + "'", int32 == (-195137));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-35L) + "'", long38 == (-35L));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-396.0d), (double) (short) 31, 8);
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction3.getField();
        org.junit.Assert.assertNotNull(fractionField4);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.add((int) (byte) 3);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.subtract((int) (short) -31);
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long14 = fraction13.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.abs();
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.divide((int) (byte) -74);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction6.multiply(fraction16);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100" + "'", str17, "100");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction1.add(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.abs();
        double double20 = fraction19.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction16.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction19.subtract((int) (short) -2);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.subtract((int) (short) 1);
        double double29 = fraction26.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction32.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction35.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction41 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction35.divide(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction35.add(200);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction26.subtract(fraction35);
        int int46 = fraction26.intValue();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction19.divide(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction47.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-20.0d) + "'", double29 == (-20.0d));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-44));
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply((int) '#');
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        java.lang.String str6 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply(1);
        float float14 = fraction13.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(50);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction13.subtract((-3));
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction2.add(fraction13);
        int int20 = fraction19.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction((double) 60, (double) 'a', (int) (byte) 7);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction21.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.multiply(14);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3 / 5" + "'", str6, "3 / 5");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction19.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction8.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply((int) '4');
        int int28 = fraction27.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-26) + "'", int28 == (-26));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction13.multiply(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction12.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.divide((int) (short) -165);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.add((int) '#');
        boolean boolean28 = fraction23.equals((java.lang.Object) fraction25);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction23.add(0);
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((-59));
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction23.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction19.divide(fraction33);
        byte byte35 = fraction33.byteValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 59 + "'", byte35 == (byte) 59);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(133.33333333333334d, (int) (byte) -5);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (-3), 800.0d, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction8.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction6.divide(fraction15);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.negate();
        java.lang.String str22 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction2.subtract(fraction19);
        double double24 = fraction19.doubleValue();
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 2" + "'", str16, "1 / 2");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-6L) + "'", long20 == (-6L));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-6" + "'", str22, "-6");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-6.0d) + "'", double24 == (-6.0d));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.abs();
        byte byte5 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 11, 4950);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.multiply(fraction6);
        java.lang.Class<?> wildcardClass10 = fraction6.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        long long4 = fraction3.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(31);
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.add(75);
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction8.getField();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 50" + "'", str7, "1 / 50");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        double double10 = fraction9.doubleValue();
        float float11 = fraction9.floatValue();
        float float12 = fraction9.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int18 = fraction17.getNumerator();
        long long19 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction13.add(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.multiply((int) ' ');
        java.lang.String str26 = fraction22.toString();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction20.add(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction20.abs();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField30 = fraction29.getField();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction20.add(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction9.subtract(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction38 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.multiply(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction41.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction41.negate();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction38.subtract(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction45.abs();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.multiply((int) (short) 35);
        int int49 = fraction48.intValue();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction48.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction53 = new org.apache.commons.math3.fraction.Fraction(10, (int) (short) 10);
        int int54 = fraction53.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction50.add(fraction53);
        boolean boolean56 = fraction34.equals((java.lang.Object) fraction53);
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-70), (int) (byte) 35);
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction34.add(fraction59);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5d) + "'", double10 == (-0.5d));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-0.5f) + "'", float11 == (-0.5f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.5f) + "'", float12 == (-0.5f));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 4" + "'", str23, "1 / 4");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1 / 4" + "'", str26, "1 / 4");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fractionField30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 357 + "'", int49 == 357);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.subtract(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.add((int) '#');
        boolean boolean23 = fraction18.equals((java.lang.Object) fraction20);
        long long24 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double29 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction20.subtract(fraction28);
        int int31 = fraction17.compareTo(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction4.add(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction36 = new org.apache.commons.math3.fraction.Fraction(99, (int) (byte) -75);
        int int37 = fraction33.compareTo(fraction36);
        java.lang.String str38 = fraction33.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7500.0d + "'", double29 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1 / 100" + "'", str38, "1 / 100");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (-59));
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        double double7 = fraction5.doubleValue();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction5.getField();
        double double9 = fraction5.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.divide(fraction5);
        int int11 = fraction2.getDenominator();
        int int12 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.multiply(fraction13);
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction16.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction(60, (-1));
        double double25 = fraction24.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.add(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.add(1);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double30 = fraction29.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str32 = fraction31.toString();
        org.apache.commons.math3.fraction.FractionField fractionField33 = fraction31.getField();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction29.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction34.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction37.multiply(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction40.negate();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction40.negate();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int44 = fraction43.intValue();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction43.multiply(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction46.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction48.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction40.multiply(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction36.subtract(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction36.abs();
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction26.add(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction54.negate();
        int int56 = fraction55.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-60.0d) + "'", double25 == (-60.0d));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1 / 2" + "'", str32, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 12451 + "'", int56 == 12451);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        java.lang.String str2 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction3.add(fraction16);
        boolean boolean18 = fraction0.equals((java.lang.Object) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double20 = fraction19.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(2);
        int int23 = fraction19.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.abs();
        long long28 = fraction27.longValue();
        int int29 = fraction19.compareTo(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction16.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.subtract((-36));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 / 2" + "'", str2, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.add((int) (short) -802);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        java.lang.String str14 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.add((int) '#');
        java.lang.String str18 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction12.divide(fraction15);
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.subtract((-6));
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction4.add(fraction22);
        double double24 = fraction4.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 / 2" + "'", str14, "-1 / 2");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "3 / 5" + "'", str18, "3 / 5");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-5 / 6" + "'", str20, "-5 / 6");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 33.333333333333336d + "'", double24 == 33.333333333333336d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction8.add(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction0.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction21.subtract(800);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.add((int) (short) 133);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (int) (short) 810);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (short) 602, (int) (short) 44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 602 to fraction (-601/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction10.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        int int19 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.add(10);
        long long22 = fraction21.longValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.reciprocal();
        int int24 = fraction16.compareTo(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str28 = fraction27.toString();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.multiply(1);
        float float32 = fraction31.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction37 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction33.add(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction31.add(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction23.subtract(fraction38);
        int int41 = fraction38.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9L + "'", long22 == 9L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1 / 4" + "'", str28, "1 / 4");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 101 + "'", int41 == 101);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction3.getField();
        java.lang.String str5 = fraction3.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1 / 2" + "'", str5, "-1 / 2");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.subtract(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.add((int) '#');
        boolean boolean23 = fraction18.equals((java.lang.Object) fraction20);
        long long24 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double29 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction20.subtract(fraction28);
        int int31 = fraction17.compareTo(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction4.add(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction32.abs();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction33.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction34.multiply((int) (short) 3);
        int int37 = fraction36.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7500.0d + "'", double29 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        long long11 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.reciprocal();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add((int) '#');
        boolean boolean10 = fraction5.equals((java.lang.Object) fraction7);
        java.lang.String str11 = fraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction4.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction4.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (-3), 800.0d, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.negate();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str29 = fraction28.toString();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.add(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction19.divide(fraction28);
        boolean boolean33 = fraction14.equals((java.lang.Object) fraction28);
        int int34 = fraction28.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction28.subtract((int) (short) 101);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3 / 5" + "'", str11, "3 / 5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1 / 2" + "'", str29, "1 / 2");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(fraction36);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.subtract((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.add(140);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction11.add(75);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction9.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((-16));
        int int20 = fraction11.compareTo(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str22 = fraction21.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.add((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.negate();
        double double35 = fraction34.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction28.add(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str38 = fraction37.toString();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction37.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction40.multiply(5);
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int44 = fraction43.intValue();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction43.multiply(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction48 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long49 = fraction48.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField50 = fraction48.getField();
        long long51 = fraction48.longValue();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction45.divide(fraction48);
        int int53 = fraction52.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction54 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str55 = fraction54.toString();
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction54.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction60 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction54.multiply(fraction60);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction52.subtract(fraction60);
        org.apache.commons.math3.fraction.Fraction fraction66 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double67 = fraction66.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction62.subtract(fraction66);
        int int69 = fraction68.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction72 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f, (int) (short) 10);
        boolean boolean73 = fraction68.equals((java.lang.Object) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction74 = fraction42.add(fraction68);
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction34.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction76 = fraction42.negate();
        double double77 = fraction42.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction78 = fraction19.subtract(fraction42);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 / 4" + "'", str22, "1 / 4");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 20.0d + "'", double35 == 20.0d);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1 / 4" + "'", str38, "1 / 4");
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 100L + "'", long49 == 100L);
        org.junit.Assert.assertNotNull(fractionField50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1 / 4" + "'", str55, "1 / 4");
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 7500.0d + "'", double67 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-195137) + "'", int69 == (-195137));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4000.0d + "'", double77 == 4000.0d);
        org.junit.Assert.assertNotNull(fraction78);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        double double15 = fraction10.percentageValue();
        short short16 = fraction10.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 33.333333333333336d + "'", double15 == 33.333333333333336d);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction0.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.add(3);
        int int15 = fraction12.intValue();
        int int16 = fraction12.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction7.getField();
        long long9 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.abs();
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction7.getField();
        int int12 = fraction7.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction2.subtract(fraction7);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(20.0d);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.negate();
        java.lang.String str4 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "20" + "'", str4, "20");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) -44, (double) 5.0f, (int) (short) -5);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.add((int) '#');
        boolean boolean9 = fraction4.equals((java.lang.Object) fraction6);
        long long10 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double15 = fraction14.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction6.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long24 = fraction23.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField25 = fraction23.getField();
        long long26 = fraction23.longValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction20.divide(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction17.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int36 = fraction35.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction35.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction32.subtract(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.subtract((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction42.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction44.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction41.add(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str49 = fraction48.toString();
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction48.multiply((int) ' ');
        java.lang.String str52 = fraction48.toString();
        boolean boolean53 = fraction44.equals((java.lang.Object) fraction48);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction48.abs();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction17.add(fraction48);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction3.add(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction55.add(2600);
        int int59 = fraction58.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7500.0d + "'", double15 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(fractionField25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1 / 4" + "'", str30, "1 / 4");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1 / 4" + "'", str49, "1 / 4");
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1 / 4" + "'", str52, "1 / 4");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10101 + "'", int59 == 10101);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10101, (int) (short) 5);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        int int7 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.add(10);
        long long10 = fraction9.longValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.reciprocal();
        long long12 = fraction9.longValue();
        int int13 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction2.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction2.divide((int) (short) -802);
        short short17 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -99 + "'", short17 == (short) -99);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(7);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add(140);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.add(75);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.negate();
        java.lang.String str11 = fraction6.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-127" + "'", str11, "-127");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.add(100);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long21 = fraction20.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField22 = fraction20.getField();
        long long23 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction14.add(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction14.add(60);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction4.divide(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int30 = fraction29.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str32 = fraction31.toString();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction29.subtract(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int35 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction37.negate();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.negate();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction33.subtract(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int42 = fraction41.intValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction41.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction44.negate();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction37.subtract(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction48 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long49 = fraction48.longValue();
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction48.multiply(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction46.multiply(fraction51);
        java.lang.String str53 = fraction46.toString();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction46.divide((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction59 = new org.apache.commons.math3.fraction.Fraction((double) 3.0f, (double) (byte) 7, 0);
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction46.divide(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction4.subtract(fraction60);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1 / 4" + "'", str32, "1 / 4");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 100L + "'", long49 == 100L);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1" + "'", str53, "-1");
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction(100, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int21 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction17.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO;
        boolean boolean30 = fraction27.equals((java.lang.Object) fraction29);
        int int31 = fraction29.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction29.multiply(10);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str35 = fraction34.toString();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction33.divide(fraction39);
        double double41 = fraction39.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction13.multiply(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction9.subtract(fraction13);
        int int44 = fraction5.compareTo(fraction13);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1 / 4" + "'", str35, "1 / 4");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 80000.0d + "'", double41 == 80000.0d);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        int int8 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.add(10);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.add((int) '#');
        boolean boolean16 = fraction11.equals((java.lang.Object) fraction13);
        java.lang.String str17 = fraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction10.multiply(fraction13);
        int int19 = fraction5.compareTo(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((double) 101.0f, (double) 'a', (int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.add(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.add((int) (byte) -46);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3 / 5" + "'", str17, "3 / 5");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-99L), 300.0d, (int) (short) 300);
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction3.getField();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-99" + "'", str4, "-99");
        org.junit.Assert.assertNotNull(fractionField5);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.negate();
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction0.getField();
        byte byte4 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        long long18 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction12.add(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction(35, 10);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction20.divide(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction29.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction30.subtract(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double37 = fraction36.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction36.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int43 = fraction42.intValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str45 = fraction44.toString();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction42.subtract(fraction44);
        int int47 = fraction42.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int49 = fraction48.intValue();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction48.negate();
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction42.divide(fraction48);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction36.multiply(fraction51);
        org.apache.commons.math3.fraction.FractionField fractionField53 = fraction52.getField();
        boolean boolean54 = fraction31.equals((java.lang.Object) fraction52);
        int int55 = fraction23.compareTo(fraction31);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1 / 4" + "'", str45, "1 / 4");
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fractionField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long17 = fraction16.longValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long22 = fraction21.longValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction16.add(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction14.subtract(fraction25);
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction25.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        double double2 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        boolean boolean13 = fraction8.equals((java.lang.Object) fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.subtract(fraction14);
        int int17 = fraction11.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.abs();
        boolean boolean19 = fraction7.equals((java.lang.Object) fraction18);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction0.divide(fraction18);
        double double22 = fraction18.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction18.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.5d + "'", double22 == 0.5d);
        org.junit.Assert.assertNotNull(fraction23);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-6), (int) (byte) -52);
        double double3 = fraction2.percentageValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.538461538461538d + "'", double3 == 11.538461538461538d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) -802, (int) (short) -30);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-0.02255639f));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0.1f, 50);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(51);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide((-100));
        int int4 = fraction3.intValue();
        double double5 = fraction3.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        int int16 = fraction10.compareTo(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((-1), (int) (byte) 74);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction10.add(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.subtract(60);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction20.add(0);
        int int25 = fraction3.compareTo(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int34 = fraction33.intValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction38.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction30.multiply(fraction40);
        org.apache.commons.math3.fraction.FractionField fractionField42 = fraction41.getField();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction26.divide(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction45 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long46 = fraction45.longValue();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction41.add(fraction48);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction49.abs();
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction20.add(fraction50);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.51d) + "'", double5 == (-0.51d));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fractionField42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction19.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction8.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.multiply(11);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction8.add(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction0.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction27.negate();
        java.lang.String str29 = fraction27.toString();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int32 = fraction31.intValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply(fraction33);
        boolean boolean35 = fraction30.equals((java.lang.Object) fraction33);
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str37 = fraction36.toString();
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int39 = fraction38.intValue();
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction38.multiply(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction41.negate();
        int int43 = fraction36.compareTo(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction30.subtract(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction44.divide((-3));
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction46.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction27.divide(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int50 = fraction49.intValue();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str52 = fraction51.toString();
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction49.subtract(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction54 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int55 = fraction54.intValue();
        org.apache.commons.math3.fraction.Fraction fraction56 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction54.multiply(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction57.negate();
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction57.negate();
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction53.subtract(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction61 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int62 = fraction61.intValue();
        org.apache.commons.math3.fraction.Fraction fraction63 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction61.multiply(fraction63);
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction64.negate();
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction57.subtract(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction65.negate();
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction48.subtract(fraction67);
        boolean boolean69 = fraction23.equals((java.lang.Object) fraction67);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1 / 2" + "'", str29, "-1 / 2");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1 / 4" + "'", str37, "1 / 4");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1 / 4" + "'", str52, "1 / 4");
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.multiply(32);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(65);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 75, (int) (byte) 50);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(24);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(100, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((-6));
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.divide(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.multiply(17);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.subtract((int) (short) 0);
        boolean boolean22 = fraction13.equals((java.lang.Object) fraction21);
        int int23 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction8.add(fraction13);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        int int18 = fraction11.compareTo(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply((int) (byte) 1);
        int int21 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction3.subtract(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.add((int) '#');
        boolean boolean28 = fraction23.equals((java.lang.Object) fraction25);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int30 = fraction29.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction29.abs();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int35 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction39 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long40 = fraction39.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField41 = fraction39.getField();
        long long42 = fraction39.longValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction36.divide(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction33.add(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction25.add(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction17.divide(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction46.abs();
        double double48 = fraction46.percentageValue();
        float float49 = fraction46.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(fractionField41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 31.25d + "'", double48 == 31.25d);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.3125f + "'", float49 == 0.3125f);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.subtract((int) (short) 602);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(200);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply((int) (byte) 8);
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction4.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        int int6 = fraction5.getNumerator();
        long long7 = fraction5.longValue();
        java.lang.Class<?> wildcardClass8 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction5.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double12 = fraction11.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.subtract(fraction19);
        int int22 = fraction17.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.negate();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction17.divide(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction11.multiply(fraction26);
        org.apache.commons.math3.fraction.FractionField fractionField28 = fraction27.getField();
        boolean boolean29 = fraction6.equals((java.lang.Object) fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction6.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 / 4" + "'", str20, "1 / 4");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction30);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-7), (double) (short) 75, (-7));
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.divide(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        boolean boolean10 = fraction5.equals((java.lang.Object) fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction11.getField();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.subtract(fraction11);
        int int14 = fraction8.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.abs();
        boolean boolean16 = fraction4.equals((java.lang.Object) fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.abs();
        long long19 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 20);
        int int22 = fraction21.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction23.getField();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.divide((int) '4');
        double double27 = fraction26.doubleValue();
        org.apache.commons.math3.fraction.FractionField fractionField28 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction21.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction17.multiply(fraction26);
        double double31 = fraction30.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.014423076923076924d + "'", double27 == 0.014423076923076924d);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.007211538461538462d) + "'", double31 == (-0.007211538461538462d));
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction2.doubleValue();
        float float4 = fraction2.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.subtract((-3));
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply((int) (byte) 10);
        int int9 = fraction6.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract(fraction5);
        int int8 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction1.add(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction3.subtract((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.divide(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.subtract((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction18.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.subtract(70);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double26 = fraction25.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction25.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int32 = fraction31.intValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int36 = fraction35.getNumerator();
        long long37 = fraction35.longValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction31.add(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction25.subtract(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction35.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction41.negate();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction41.abs();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction18.divide(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction44.negate();
        org.apache.commons.math3.fraction.Fraction fraction48 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction48.multiply(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction51.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction57 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction51.divide(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction45.multiply(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction60 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        int int61 = fraction60.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction60.negate();
        org.apache.commons.math3.fraction.FractionField fractionField63 = fraction60.getField();
        int int64 = fraction58.compareTo(fraction60);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fractionField63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 3L);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction(112.5d, (-59));
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.divide(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.subtract((-31));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide(5);
        int int14 = fraction11.getDenominator();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 51);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.add(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction1.divide(11);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.divide(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long15 = fraction14.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction11.add(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply((int) (short) 75);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction29 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.multiply((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction33.multiply((int) (byte) 10);
        int int36 = fraction33.getDenominator();
        org.apache.commons.math3.fraction.FractionField fractionField37 = fraction33.getField();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction21.multiply(fraction33);
        double double39 = fraction33.doubleValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(fractionField37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-485.0d) + "'", double39 == (-485.0d));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -100, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide((-100));
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.multiply(fraction13);
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction14.getField();
        double double17 = fraction14.percentageValue();
        float float18 = fraction14.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction14.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.142857142857143d + "'", double17 == 2.142857142857143d);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.021428572f + "'", float18 == 0.021428572f);
        org.junit.Assert.assertNotNull(fraction19);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.014423076923076924d, 8);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        int int8 = fraction7.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double13 = fraction12.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long18 = fraction17.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.abs();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.abs();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction14.add(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction2.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction2.subtract((int) (short) 8);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7500.0d + "'", double13 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction19.getField();
        long long22 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction16.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction13.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.subtract(10);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction23.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.add((int) (byte) -9);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str35 = fraction34.toString();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int37 = fraction36.intValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.multiply(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction39.negate();
        int int41 = fraction34.compareTo(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction34.reciprocal();
        float float43 = fraction34.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction34.divide(200);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction34.divide((-10));
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction33.subtract(fraction34);
        java.lang.Class<?> wildcardClass49 = fraction33.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1 / 4" + "'", str35, "1 / 4");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.25f + "'", float43 == 0.25f);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.multiply((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.multiply((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction8.divide(fraction16);
        java.lang.String str20 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -75, (int) (byte) 35);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction16.multiply(fraction23);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-485" + "'", str20, "-485");
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(5, 35);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(208);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply((int) (byte) 74);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str8 = fraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.multiply(5);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long19 = fraction18.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction18.getField();
        long long21 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction15.divide(fraction18);
        int int23 = fraction22.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str25 = fraction24.toString();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction30 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction24.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction22.subtract(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction36 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double37 = fraction36.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction32.subtract(fraction36);
        int int39 = fraction38.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction42 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f, (int) (short) 10);
        boolean boolean43 = fraction38.equals((java.lang.Object) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction12.add(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction47 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction47.negate();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction48.multiply(3);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction50.abs();
        org.apache.commons.math3.fraction.Fraction fraction52 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction52.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction52.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction50.multiply(fraction52);
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction58 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction57.multiply(fraction58);
        double double60 = fraction57.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction52.divide(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction38.multiply(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction6.subtract(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction38.reciprocal();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 4" + "'", str8, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 / 4" + "'", str25, "1 / 4");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 7500.0d + "'", double37 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-195137) + "'", int39 == (-195137));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 20.0d + "'", double60 == 20.0d);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply((int) (short) 100);
        long long21 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction12.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction(4, 1);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.add((int) (short) -1);
        boolean boolean28 = fraction12.equals((java.lang.Object) fraction25);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double30 = fraction29.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str32 = fraction31.toString();
        org.apache.commons.math3.fraction.FractionField fractionField33 = fraction31.getField();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction29.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction34.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str38 = fraction37.toString();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int40 = fraction39.intValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction39.multiply(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction42.negate();
        int int44 = fraction37.compareTo(fraction43);
        float float45 = fraction37.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField46 = fraction37.getField();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction34.subtract(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction37.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField49 = fraction37.getField();
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction50.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction37.subtract(fraction52);
        int int54 = fraction12.compareTo(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double56 = fraction55.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction55.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction55.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction61 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int62 = fraction61.intValue();
        org.apache.commons.math3.fraction.Fraction fraction63 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str64 = fraction63.toString();
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction61.subtract(fraction63);
        int int66 = fraction61.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction67 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int68 = fraction67.intValue();
        org.apache.commons.math3.fraction.Fraction fraction69 = fraction67.negate();
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction61.divide(fraction67);
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction55.multiply(fraction70);
        float float72 = fraction70.floatValue();
        double double73 = fraction70.doubleValue();
        int int74 = fraction70.getDenominator();
        boolean boolean75 = fraction12.equals((java.lang.Object) int74);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 800L + "'", long21 == 800L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1 / 2" + "'", str32, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1 / 4" + "'", str38, "1 / 4");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.25f + "'", float45 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fractionField49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1 / 4" + "'", str64, "1 / 4");
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + (-0.25f) + "'", float72 == (-0.25f));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-0.25d) + "'", double73 == (-0.25d));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int17 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply(fraction18);
        boolean boolean20 = fraction15.equals((java.lang.Object) fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction13.divide(fraction15);
        java.lang.String str22 = fraction15.toString();
        java.lang.Class<?> wildcardClass23 = fraction15.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-802), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction -802/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-10), (-75));
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add(502);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(259.0d, 50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 259 to fraction (9,223,372,036,854,775,550/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long6 = fraction5.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        int int9 = fraction8.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double14 = fraction13.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.divide(fraction13);
        java.lang.Object obj16 = null;
        boolean boolean17 = fraction13.equals(obj16);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction21.divide((-1));
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction13.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction28.abs();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction13.multiply(fraction28);
        int int34 = fraction33.intValue();
        boolean boolean35 = fraction1.equals((java.lang.Object) int34);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction1.subtract((int) (short) 150);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7500.0d + "'", double14 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-75) + "'", int34 == (-75));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2);
        java.lang.String str5 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.subtract(40);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.abs();
        int int9 = fraction8.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-99" + "'", str5, "-99");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.multiply((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction9.divide((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction9.divide((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction1.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.add((int) '#');
        boolean boolean22 = fraction17.equals((java.lang.Object) fraction19);
        long long23 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double28 = fraction27.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction19.subtract(fraction27);
        java.lang.String str30 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction15.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str35 = fraction34.toString();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction32.subtract(fraction34);
        long long37 = fraction36.longValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.negate();
        int int39 = fraction36.getNumerator();
        double double40 = fraction36.doubleValue();
        boolean boolean41 = fraction31.equals((java.lang.Object) fraction36);
        java.lang.Class<?> wildcardClass42 = fraction36.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7500.0d + "'", double28 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "3 / 5" + "'", str30, "3 / 5");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1 / 4" + "'", str35, "1 / 4");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-20), (int) (short) 50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -20 to fraction (21/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        java.lang.String str6 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((double) 3L);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.subtract(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction2.subtract(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction(51);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        int int20 = fraction16.compareTo(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str22 = fraction21.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.multiply(5);
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long33 = fraction32.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField34 = fraction32.getField();
        long long35 = fraction32.longValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction29.divide(fraction32);
        int int37 = fraction36.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str39 = fraction38.toString();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction38.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction44 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction38.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction36.subtract(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction50 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double51 = fraction50.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction46.subtract(fraction50);
        int int53 = fraction52.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction56 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f, (int) (short) 10);
        boolean boolean57 = fraction52.equals((java.lang.Object) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction26.add(fraction52);
        int int59 = fraction58.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction16.multiply(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction2.multiply(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction62 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double63 = fraction62.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction64 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str65 = fraction64.toString();
        org.apache.commons.math3.fraction.FractionField fractionField66 = fraction64.getField();
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction62.multiply(fraction64);
        org.apache.commons.math3.fraction.Fraction fraction70 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction70.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction64.add(fraction70);
        org.apache.commons.math3.fraction.Fraction fraction73 = fraction61.divide(fraction70);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3 / 5" + "'", str6, "3 / 5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 / 4" + "'", str22, "1 / 4");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(fractionField34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 200 + "'", int37 == 200);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1 / 4" + "'", str39, "1 / 4");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 7500.0d + "'", double51 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-195137) + "'", int53 == (-195137));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2600 + "'", int59 == 2600);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1 / 2" + "'", str65, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(136, (int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(101, (int) (short) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.subtract(fraction10);
        int int13 = fraction8.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction8.divide(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.divide((-13));
        boolean boolean21 = fraction3.equals((java.lang.Object) fraction18);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 4" + "'", str11, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(5, (-99));
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) (byte) 32);
        java.lang.String str5 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-5 / 99" + "'", str5, "-5 / 99");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0.13333334f, 0);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -74, (int) (short) 24);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        java.lang.String str2 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction3.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction3.add(fraction16);
        boolean boolean18 = fraction0.equals((java.lang.Object) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double20 = fraction19.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(2);
        int int23 = fraction19.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.abs();
        long long28 = fraction27.longValue();
        int int29 = fraction19.compareTo(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction16.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction33.multiply(2);
        java.lang.String str36 = fraction35.toString();
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str40 = fraction39.toString();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction37.subtract(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int43 = fraction42.intValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction42.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction45.negate();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction45.negate();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction41.subtract(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int50 = fraction49.intValue();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction49.multiply(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction52.negate();
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction45.subtract(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction35.add(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction19.subtract(fraction45);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 / 2" + "'", str2, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-198" + "'", str36, "-198");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1 / 4" + "'", str40, "1 / 4");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.reciprocal();
        long long7 = fraction4.longValue();
        long long8 = fraction4.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction11.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction7.subtract(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction7.abs();
        double double25 = fraction7.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double27 = fraction26.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str29 = fraction28.toString();
        org.apache.commons.math3.fraction.FractionField fractionField30 = fraction28.getField();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction26.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int35 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction37.negate();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.negate();
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int41 = fraction40.intValue();
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction40.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction43.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction45.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction37.multiply(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction33.subtract(fraction48);
        double double50 = fraction49.doubleValue();
        boolean boolean51 = fraction7.equals((java.lang.Object) fraction49);
        byte byte52 = fraction49.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 12.5d + "'", double25 == 12.5d);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1 / 2" + "'", str29, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.10357142857142858d + "'", double50 == 0.10357142857142858d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 0 + "'", byte52 == (byte) 0);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (-101));
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(80);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(4);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 100);
        long long6 = fraction5.longValue();
        int int7 = fraction5.getDenominator();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction5.getField();
        java.lang.String str9 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply((int) ' ');
        double double14 = fraction10.doubleValue();
        long long15 = fraction10.longValue();
        double double16 = fraction10.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long19 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction10.subtract(fraction18);
        int int21 = fraction20.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.add(0);
        double double24 = fraction23.percentageValue();
        boolean boolean25 = fraction5.equals((java.lang.Object) fraction23);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction5.add(140);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 800L + "'", long6 == 800L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "800" + "'", str9, "800");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 4" + "'", str11, "1 / 4");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.25d + "'", double14 == 0.25d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.25d + "'", double16 == 0.25d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-399) + "'", int21 == (-399));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9975.0d) + "'", double24 == (-9975.0d));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long11 = fraction10.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction10.getField();
        long long13 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.divide(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.add(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.add(10);
        boolean boolean24 = fraction7.equals((java.lang.Object) fraction21);
        org.apache.commons.math3.fraction.Fraction fraction26 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long27 = fraction26.longValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply(fraction28);
        int int30 = fraction29.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction34 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double35 = fraction34.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction29.divide(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int39 = fraction38.intValue();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction37.add(fraction38);
        java.lang.String str41 = fraction40.toString();
        int int42 = fraction21.compareTo(fraction40);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 / 4" + "'", str17, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 7500.0d + "'", double35 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-76" + "'", str41, "-76");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.multiply(fraction8);
        long long12 = fraction8.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.divide(fraction15);
        boolean boolean18 = fraction8.equals((java.lang.Object) fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.multiply(8);
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction29 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.divide(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction22.subtract(fraction29);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) 101, (double) 50, 350);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((int) 'a');
        float float8 = fraction5.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.add((int) (short) 1);
        double double16 = fraction13.percentageValue();
        int int17 = fraction9.compareTo(fraction13);
        int int18 = fraction9.intValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-5.0f) + "'", float8 == (-5.0f));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 33.333333333333336d + "'", double16 == 33.333333333333336d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0.02f, (int) (short) 800);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(12250.0d, (-0.6d), (-10));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 12,250 to fraction (-12,249/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction4);
        int int6 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.negate();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction4.getField();
        short short9 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(fraction6);
        int int9 = fraction4.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction4.divide(fraction10);
        float float14 = fraction10.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.divide((int) '4');
        double double19 = fraction18.doubleValue();
        int int20 = fraction10.compareTo(fraction18);
        boolean boolean21 = fraction3.equals((java.lang.Object) fraction18);
        double double22 = fraction18.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.014423076923076924d + "'", double19 == 0.014423076923076924d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.014423076923076924d + "'", double22 == 0.014423076923076924d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide((-1));
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.abs();
        long long21 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply(31);
        java.lang.String str24 = fraction20.toString();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction20.abs();
        int int26 = fraction14.compareTo(fraction25);
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction14.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1 / 50" + "'", str24, "1 / 50");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(fractionField27);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -52);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -52 + "'", short2 == (short) -52);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction21.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long33 = fraction32.longValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction32.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction30.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction12.divide(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction39 = new org.apache.commons.math3.fraction.Fraction((double) 3L);
        org.apache.commons.math3.fraction.Fraction fraction42 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction39.subtract(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction46 = new org.apache.commons.math3.fraction.Fraction(112.5d, (-59));
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction43.divide(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction46.subtract((-31));
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction12.add(fraction46);
        short short51 = fraction50.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + short51 + "' != '" + (short) 67 + "'", short51 == (short) 67);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 35, 139);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 100, (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction20 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.subtract(200);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction10.add(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction6.divide(fraction27);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 / 4" + "'", str15, "1 / 4");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -99);
        double double2 = fraction1.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) -1);
        long long6 = fraction5.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction11.add(5);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.divide((int) ' ');
        org.apache.commons.math3.fraction.FractionField fractionField23 = fraction22.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction5.divide(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction1.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction31 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction31.abs();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction26.subtract(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int37 = fraction36.intValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.negate();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.abs();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction26.add(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int42 = fraction41.intValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str44 = fraction43.toString();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction41.subtract(fraction43);
        int int46 = fraction41.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int48 = fraction47.intValue();
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction47.negate();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction41.divide(fraction47);
        float float51 = fraction47.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction52 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField53 = fraction52.getField();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction52.divide((int) '4');
        double double56 = fraction55.doubleValue();
        int int57 = fraction47.compareTo(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction39.divide(fraction47);
        int int59 = fraction39.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction1.divide(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction61 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int62 = fraction61.intValue();
        org.apache.commons.math3.fraction.Fraction fraction63 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str64 = fraction63.toString();
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction61.subtract(fraction63);
        int int66 = fraction61.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction61.multiply(32);
        org.apache.commons.math3.fraction.Fraction fraction69 = fraction60.add(fraction68);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-99.0d) + "'", double2 == (-99.0d));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1 / 4" + "'", str44, "1 / 4");
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.0f) + "'", float51 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fractionField53);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.014423076923076924d + "'", double56 == 0.014423076923076924d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1 / 4" + "'", str64, "1 / 4");
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -59, 60);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        java.lang.String str8 = fraction0.toString();
        long long9 = fraction0.longValue();
        java.lang.Class<?> wildcardClass10 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 4" + "'", str8, "1 / 4");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-0.10526315789473684d), (double) (byte) -1, (int) (byte) 58);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -0.105 to fraction (-281,474,976,710,657/2,674,012,278,751,241)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.add((int) (short) 800);
        long long7 = fraction2.longValue();
        byte byte8 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 3 + "'", byte8 == (byte) 3);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(357, (-2));
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction6.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction6.multiply(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction2.multiply(fraction19);
        byte byte21 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 78 + "'", byte21 == (byte) 78);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        long long5 = fraction0.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction10.add(5);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction0.add(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField29 = fraction28.getField();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction33 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction28.multiply(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.FractionField fractionField36 = fraction35.getField();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction27.multiply(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction20.multiply(fraction27);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fractionField29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fractionField36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.reciprocal();
        long long7 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(101, (int) (short) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.negate();
        double double13 = fraction12.percentageValue();
        java.lang.String str14 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1010.0d) + "'", double13 == (-1010.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-101 / 10" + "'", str14, "-101 / 10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        boolean boolean12 = fraction1.equals((java.lang.Object) fraction11);
        int int13 = fraction11.getDenominator();
        int int14 = fraction11.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction1.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.negate();
        java.lang.String str11 = fraction9.toString();
        float float12 = fraction9.floatValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25" + "'", str11, "25");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 25.0f + "'", float12 == 25.0f);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.divide((-25));
        double double9 = fraction8.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.divide((-127));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0044444444444444444d) + "'", double9 == (-0.0044444444444444444d));
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int11 = fraction10.getNumerator();
        long long12 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.divide(99);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.subtract((-501));
        long long22 = fraction21.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 501L + "'", long22 == 501L);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long17 = fraction16.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction16.getField();
        long long19 = fraction16.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction13.divide(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction10.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction2.add(fraction10);
        long long23 = fraction22.longValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.add(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math3.fraction.Fraction fraction29 = new org.apache.commons.math3.fraction.Fraction((-0.5d));
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int32 = fraction31.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction30.multiply(fraction34);
        java.lang.String str36 = fraction34.toString();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction29.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int40 = fraction39.intValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction39.multiply(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction42.negate();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction42.negate();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction29.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction26.multiply(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction46.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1 / 3" + "'", str36, "1 / 3");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
    }
}

