package org.apache.commons.math3.fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long6 = fraction5.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction5.getField();
        long long8 = fraction5.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.divide(fraction5);
        int int10 = fraction9.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction9.subtract(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int21 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction20.subtract(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction17.subtract(fraction24);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 4" + "'", str23, "1 / 4");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        double double5 = fraction2.percentageValue();
        int int6 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.divide(fraction7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-20.0d) + "'", double5 == (-20.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction3.getField();
        byte byte5 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.subtract(fraction17);
        int int20 = fraction15.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction15.divide(fraction21);
        float float25 = fraction21.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.divide((int) '4');
        double double30 = fraction29.doubleValue();
        int int31 = fraction21.compareTo(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction13.divide(fraction21);
        byte byte33 = fraction21.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.014423076923076924d + "'", double30 == 0.014423076923076924d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) -1 + "'", byte33 == (byte) -1);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(20.0d, (double) (-0.5f), (-101));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 20 to fraction (-19/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.0d, 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.subtract(fraction17);
        int int20 = fraction15.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction15.divide(fraction21);
        float float25 = fraction21.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.divide((int) '4');
        double double30 = fraction29.doubleValue();
        int int31 = fraction21.compareTo(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction13.divide(fraction21);
        int int33 = fraction13.getDenominator();
        java.lang.Class<?> wildcardClass34 = fraction13.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.014423076923076924d + "'", double30 == 0.014423076923076924d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        double double4 = fraction0.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply((int) ' ');
        java.lang.String str12 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction7.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.add(fraction13);
        int int15 = fraction13.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-25) + "'", int15 == (-25));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 100, (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        boolean boolean9 = fraction2.equals((java.lang.Object) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.multiply((int) '#');
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction14.getField();
        boolean boolean18 = fraction13.equals((java.lang.Object) fraction14);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction13.abs();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction2.add(fraction19);
        int int21 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-59), (-1.0309278350515463d), (int) (short) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -59 to fraction (-9,223,372,036,854,775,748/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.reciprocal();
        byte byte12 = fraction11.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -5 + "'", byte12 == (byte) -5);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        int int16 = fraction7.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction7.add((int) ' ');
        long long19 = fraction7.longValue();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double4 = fraction3.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction11);
        int int13 = fraction11.intValue();
        int int14 = fraction11.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.subtract(0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction9.multiply((int) (byte) 37);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction9.subtract(200);
        long long17 = fraction9.longValue();
        double double18 = fraction9.percentageValue();
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
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-50.0d) + "'", double18 == (-50.0d));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-4));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction8.subtract(fraction23);
        double double25 = fraction24.doubleValue();
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
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-59.75d) + "'", double25 == (-59.75d));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(10);
        java.lang.String str2 = fraction1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        org.apache.commons.math3.fraction.Fraction fraction38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction39 = fraction31.multiply(fraction38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction6);
        int int10 = fraction0.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        double double21 = fraction20.doubleValue();
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.6d) + "'", double21 == (-0.6d));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.subtract((int) ' ');
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
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(20.0d, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 20 to fraction (-19/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) -802, (double) (-100L), (-52));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -802 to fraction (803/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        java.lang.String str6 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.add(fraction4);
        double double8 = fraction7.percentageValue();
        int int9 = fraction7.intValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 3" + "'", str6, "1 / 3");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10033.333333333332d + "'", double8 == 10033.333333333332d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction6);
        float float10 = fraction6.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction16.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction27.negate();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction20.subtract(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long32 = fraction31.longValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction29.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction6.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction6.add((-6));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 / 4" + "'", str15, "1 / 4");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        short short13 = fraction4.shortValue();
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
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 9 + "'", short13 == (short) 9);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 75, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 75 to fraction (9,223,372,036,854,775,734/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(100);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction1.getField();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-99.5f));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-3), 800.0d, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.add(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction5.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction3.divide(fraction12);
        long long17 = fraction16.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction16.getField();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 2" + "'", str13, "1 / 2");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-6L) + "'", long17 == (-6L));
        org.junit.Assert.assertNotNull(fractionField18);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        int int20 = fraction19.getNumerator();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-127) + "'", int20 == (-127));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        byte byte11 = fraction9.byteValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -100 + "'", byte11 == (byte) -100);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction8.subtract(fraction23);
        byte byte25 = fraction24.byteValue();
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
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -59 + "'", byte25 == (byte) -59);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(200, (int) '4');
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.multiply((int) (byte) 1);
        float float15 = fraction14.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.multiply((int) (short) 10);
        long long17 = fraction16.longValue();
        byte byte18 = fraction16.byteValue();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5L + "'", long17 == 5L);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 5 + "'", byte18 == (byte) 5);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 0L);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        float float3 = fraction1.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.add(fraction4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        boolean boolean12 = fraction9.equals((java.lang.Object) false);
        int int13 = fraction9.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.subtract((int) (short) 1);
        double double19 = fraction16.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction22.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction31 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction25.divide(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction25.add(200);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction16.subtract(fraction25);
        org.apache.commons.math3.fraction.FractionField fractionField36 = fraction35.getField();
        boolean boolean37 = fraction9.equals((java.lang.Object) fractionField36);
        java.lang.String str38 = fraction9.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-20.0d) + "'", double19 == (-20.0d));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fractionField36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-100" + "'", str38, "-100");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(200, (int) (short) 3);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 66 + "'", short3 == (short) 66);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) 2, (int) (byte) -9);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-0.014285714285714285d), (double) (-59), 60);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -0.014 to fraction (-1,327,712,154,295/92,939,850,800,651)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.multiply(fraction15);
        float float17 = fraction15.floatValue();
        java.lang.String str18 = fraction15.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.25f) + "'", float17 == (-0.25f));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1 / 4" + "'", str18, "-1 / 4");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((double) 0L);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        boolean boolean14 = fraction3.equals((java.lang.Object) int13);
        int int15 = fraction3.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(0);
        int int7 = fraction6.intValue();
        double double8 = fraction6.percentageValue();
        int int9 = fraction6.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.reciprocal();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        boolean boolean12 = fraction9.equals((java.lang.Object) false);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.multiply((int) (short) 100);
        long long19 = fraction18.longValue();
        int int20 = fraction18.getDenominator();
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction18.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction9.divide(fraction18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 / 4" + "'", str14, "1 / 4");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 800L + "'", long19 == 800L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 100, (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        boolean boolean9 = fraction2.equals((java.lang.Object) fraction6);
        int int10 = fraction6.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-0.6d), (int) '4');
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) -1, (int) (short) 1);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        int int7 = fraction0.getNumerator();
        java.lang.Class<?> wildcardClass8 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) 10, (-100.0d), 99);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction0.multiply(fraction11);
        int int13 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction0.add(208);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 20);
        boolean boolean4 = fraction2.equals((java.lang.Object) "10");
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.abs();
        long long9 = fraction8.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction2.divide(fraction10);
        byte byte12 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        java.lang.Class<?> wildcardClass23 = fraction22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        int int7 = fraction0.getNumerator();
        java.lang.String str8 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3 / 4" + "'", str8, "3 / 4");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 75, 35);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-10), (-75));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        int int25 = fraction7.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction7.add((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.multiply(fraction7);
        byte byte12 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.add(10);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.abs();
        int int12 = fraction11.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction0.multiply(fraction11);
        int int14 = fraction11.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 800 + "'", int14 == 800);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply(2);
        boolean boolean9 = fraction3.equals((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        java.lang.Class<?> wildcardClass4 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        java.lang.String str4 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction8.subtract(fraction23);
        org.apache.commons.math3.fraction.FractionField fractionField25 = fraction24.getField();
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
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fractionField25);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        double double5 = fraction4.percentageValue();
        byte byte6 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(80.0d, (-4));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 80 to fraction (-79/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add(35);
        int int7 = fraction6.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 139 + "'", int7 == 139);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        int int10 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction11);
        long long14 = fraction11.longValue();
        java.lang.String str15 = fraction11.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3 / 5" + "'", str15, "3 / 5");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(4, 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) (short) -1);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 208);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) 0.02f, (int) (short) 800);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction15.add(fraction19);
        float float23 = fraction22.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.27f + "'", float23 == 0.27f);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide((-3));
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.reciprocal();
        int int18 = fraction16.getDenominator();
        long long19 = fraction16.longValue();
        int int20 = fraction16.getNumerator();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.divide(fraction2);
        double double5 = fraction4.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.75d + "'", double5 == 0.75d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        int int4 = fraction3.intValue();
        short short5 = fraction3.shortValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply((int) '#');
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction12.getField();
        boolean boolean16 = fraction8.equals((java.lang.Object) fraction12);
        float float17 = fraction12.floatValue();
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
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        long long4 = fraction3.longValue();
        double double5 = fraction3.doubleValue();
        double double6 = fraction3.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.02d + "'", double5 == 0.02d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.02d + "'", double6 == 0.02d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) 35, (double) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ZERO;
        java.lang.String str1 = fraction0.toString();
        java.lang.String str2 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((int) '#');
        boolean boolean12 = fraction7.equals((java.lang.Object) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction7.multiply(fraction13);
        int int17 = fraction13.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.add(fraction13);
        int int19 = fraction18.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "101" + "'", str6, "101");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 / 2" + "'", str14, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 203 + "'", int19 == 203);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double5 = fraction4.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int15 = fraction14.getNumerator();
        long long16 = fraction14.longValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.add(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction4.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction0.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((double) (-3), 800.0d, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str33 = fraction32.toString();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.add(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction25.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction23.divide(fraction32);
        int int37 = fraction36.getNumerator();
        boolean boolean38 = fraction18.equals((java.lang.Object) fraction36);
        float float39 = fraction18.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1 / 2" + "'", str33, "1 / 2");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-6) + "'", int37 == (-6));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.6666667f + "'", float39 == 0.6666667f);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        int int13 = fraction10.compareTo(fraction12);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        int int2 = fraction0.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.Class<?> wildcardClass1 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction5.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.multiply(fraction18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-10));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 37);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.divide((int) ' ');
        boolean boolean17 = fraction15.equals((java.lang.Object) 51L);
        double double18 = fraction15.doubleValue();
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
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.15625d + "'", double18 == 0.15625d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 0/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-101), (int) (short) 2);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        int int2 = fraction0.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        long long4 = fraction3.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(31);
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.subtract(203);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 50" + "'", str7, "1 / 50");
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-25.0d));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2);
        java.lang.String str5 = fraction4.toString();
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
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction14.subtract(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction4.add(fraction14);
        byte byte25 = fraction24.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-198" + "'", str5, "-198");
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 58 + "'", byte25 == (byte) 58);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) '4', (int) (short) 51);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 52 to fraction (-51/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        int int15 = fraction3.intValue();
        java.lang.String str16 = fraction3.toString();
        int int17 = fraction3.intValue();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 / 2" + "'", str16, "-1 / 2");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction19.multiply(99);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction33 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10, 35);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.divide(fraction33);
        int int35 = fraction33.getNumerator();
        int int36 = fraction19.compareTo(fraction33);
        byte byte37 = fraction33.byteValue();
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
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 0 + "'", byte37 == (byte) 0);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        double double3 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-50.0d) + "'", double3 == (-50.0d));
        org.junit.Assert.assertNotNull(fractionField4);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction3.multiply(fraction15);
        short short17 = fraction16.shortValue();
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
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(7, (int) (byte) -59);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) (byte) 1);
        double double6 = fraction5.doubleValue();
        short short7 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -2 + "'", short7 == (short) -2);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction9.multiply((int) (byte) 37);
        short short15 = fraction9.shortValue();
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
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        double double4 = fraction0.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply((int) ' ');
        java.lang.String str12 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction7.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.add(fraction13);
        long long15 = fraction0.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        int int11 = fraction6.getNumerator();
        java.lang.Class<?> wildcardClass12 = fraction6.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-399), (-500.0d), 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -399 to fraction (-9,223,372,036,854,775,408/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.divide(99);
        int int6 = fraction5.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4950 + "'", int6 == 4950);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 32, (double) 6, (int) (short) -198);
        long long4 = fraction3.longValue();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        int int35 = fraction9.getNumerator();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        short short6 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        int int42 = fraction40.intValue();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract(fraction9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add(140);
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 192 + "'", short4 == (short) 192);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f, (double) (byte) 5, (int) (short) 800);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.reciprocal();
        byte byte6 = fraction5.byteValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.add(fraction6);
        int int9 = fraction6.getDenominator();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction6.getField();
        double double11 = fraction6.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 101, (-35.0d), (int) (byte) 37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 101 to fraction (9,223,372,036,854,775,708/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(2);
        int int2 = fraction1.getDenominator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        java.lang.Object obj20 = null;
        boolean boolean21 = fraction8.equals(obj20);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        java.lang.String str5 = fraction4.toString();
        int int6 = fraction4.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 2" + "'", str5, "1 / 2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        int int26 = fraction25.getNumerator();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-802) + "'", int26 == (-802));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.add((int) '#');
        boolean boolean14 = fraction9.equals((java.lang.Object) fraction11);
        long long15 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double20 = fraction19.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction11.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.negate();
        int int23 = fraction8.compareTo(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.divide(208);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction -75/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7500.0d + "'", double20 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) -198, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction -198/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-0.5f), (-25.0d), 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Unable to convert -0.5 to fraction after 8 iterations");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(133.33333333333334d, (int) (byte) -5);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2600);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(35, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.divide(fraction7);
        java.lang.String str9 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "133" + "'", str9, "133");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (-59));
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        double double7 = fraction5.doubleValue();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction5.getField();
        double double9 = fraction5.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.divide(fraction5);
        byte byte11 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02d + "'", double7 == 0.02d);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction31.negate();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.negate();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int35 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction31.multiply(fraction41);
        org.apache.commons.math3.fraction.FractionField fractionField43 = fraction42.getField();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction42.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField46 = fraction45.getField();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction44.subtract(fraction48);
        int int50 = fraction44.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction19.subtract(fraction44);
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
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(fraction30);
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
        org.junit.Assert.assertNotNull(fractionField43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fractionField46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 140 + "'", int50 == 140);
        org.junit.Assert.assertNotNull(fraction51);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        double double7 = fraction6.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.subtract(41);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        boolean boolean17 = fraction9.equals((java.lang.Object) fraction16);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 133.33333333333334d + "'", double7 == 133.33333333333334d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) -198, (double) 100.0f, (-1));
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 300);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.reciprocal();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-0.6d), (int) (byte) 75);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(35);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.add(101);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.reciprocal();
        long long6 = fraction1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(133.33333333333334d, (int) (byte) -5);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2600);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 'a', (double) (-6L), (int) (short) 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 97 to fraction (9,223,372,036,854,775,712/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (int) (byte) 58);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.divide(fraction2);
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.subtract((int) (byte) 100);
        float float8 = fraction4.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3 / 4" + "'", str5, "3 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.75f + "'", float8 == 0.75f);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(1);
        float float7 = fraction6.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(50);
        double double10 = fraction6.doubleValue();
        long long11 = fraction6.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.divide(fraction9);
        java.lang.Object obj12 = null;
        boolean boolean13 = fraction9.equals(obj12);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.divide((-1));
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction9.divide(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.abs();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction9.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.add((int) '#');
        int int32 = fraction31.getDenominator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 203, (-4));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 203 to fraction (9,223,372,036,854,775,606/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        int int4 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.abs();
        long long9 = fraction8.longValue();
        int int10 = fraction0.compareTo(fraction8);
        java.lang.String str11 = fraction8.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 50" + "'", str11, "1 / 50");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-59.25d), 0);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.reciprocal();
        double double3 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(12.5d, (double) (short) -2, (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 12.5 to fraction (9,223,372,036,854,775,795/-1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        float float6 = fraction5.floatValue();
        short short7 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 101.0f + "'", float6 == 101.0f);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        double double4 = fraction3.doubleValue();
        byte byte5 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.014423076923076924d + "'", double4 == 0.014423076923076924d);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 3, 800);
        boolean boolean8 = fraction4.equals((java.lang.Object) 800);
        double double9 = fraction4.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.5d + "'", double9 == 0.5d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.subtract((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.divide(fraction12);
        float float16 = fraction12.floatValue();
        long long17 = fraction12.longValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction12.abs();
        int int19 = fraction5.compareTo(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.divide((int) (short) 66);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.0d, (-25));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 0, (double) 10L, (-10));
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        long long5 = fraction4.longValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(1000.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-16), (-10));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -16 to fraction (17/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        java.lang.String str8 = fraction0.toString();
        int int9 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction0.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 4" + "'", str8, "1 / 4");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(fractionField10);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int20 = fraction19.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.negate();
        int int24 = fraction17.compareTo(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction17.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction14.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction9.subtract(fraction25);
        int int28 = fraction25.intValue();
        double double29 = fraction25.percentageValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 400.0d + "'", double29 == 400.0d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.reciprocal();
        int int7 = fraction6.getNumerator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int20 = fraction19.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.negate();
        int int24 = fraction17.compareTo(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction17.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction14.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction9.subtract(fraction25);
        int int28 = fraction25.intValue();
        byte byte29 = fraction25.byteValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 4 + "'", byte29 == (byte) 4);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 2, (int) (short) 51);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.add(fraction12);
        int int16 = fraction8.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction8.add((int) (short) 127);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(fraction18);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 101);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        java.lang.String str25 = fraction19.toString();
        boolean boolean27 = fraction19.equals((java.lang.Object) 0.10357142857142858d);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction19.reciprocal();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 / 4" + "'", str25, "1 / 4");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction28);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(100);
        int int3 = fraction2.getNumerator();
        int int4 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 127, 60);
        double double3 = fraction2.percentageValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 211.66666666666666d + "'", double3 == 211.66666666666666d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 20, 800);
        int int3 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0, 3);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        double double5 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction11.add(200);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction2.subtract(fraction11);
        org.apache.commons.math3.fraction.FractionField fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-20.0d) + "'", double5 == (-20.0d));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction22.reciprocal();
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
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction17.multiply(fraction22);
        int int24 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.negate();
        org.apache.commons.math3.fraction.FractionField fractionField26 = fraction22.getField();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction17.multiply(50);
        int int23 = fraction17.intValue();
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 139, (-100));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 139 to fraction (9,223,372,036,854,775,670/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        int int7 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.add(5);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.subtract(75);
        int int15 = fraction12.getNumerator();
        java.lang.Class<?> wildcardClass16 = fraction12.getClass();
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
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 74, (int) (byte) 4);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-25.0d), (double) 75, 0);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long6 = fraction5.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction5.getField();
        long long8 = fraction5.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.divide(fraction5);
        int int10 = fraction9.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction9.subtract(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double24 = fraction23.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction19.subtract(fraction23);
        short short26 = fraction19.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7500.0d + "'", double24 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (short) 192, 2600);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 192 to fraction (-191/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.multiply(fraction15);
        float float17 = fraction15.floatValue();
        byte byte18 = fraction15.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.25f) + "'", float17 == (-0.25f));
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10, 35);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.divide(fraction5);
        int int7 = fraction5.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.negate();
        boolean boolean12 = fraction3.equals((java.lang.Object) fraction11);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) '#', (double) (short) -10, 76);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 35 to fraction (9,223,372,036,854,775,774/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 1, 1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.subtract(50);
        byte byte8 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction4.add(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.subtract((int) ' ');
        java.lang.Class<?> wildcardClass16 = fraction13.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        int int20 = fraction2.getNumerator();
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
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        java.lang.String str17 = fraction15.toString();
        int int18 = fraction15.getNumerator();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2" + "'", str17, "2");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) -100, (int) (byte) 20);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction3);
        double double8 = fraction7.percentageValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-600.0d) + "'", double8 == (-600.0d));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction22.abs();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long33 = fraction32.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField34 = fraction32.getField();
        long long35 = fraction32.longValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction29.divide(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction26.add(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction26.abs();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int40 = fraction39.intValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction39.multiply(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction42.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction44.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction46.negate();
        org.apache.commons.math3.fraction.Fraction fraction49 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long50 = fraction49.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField51 = fraction49.getField();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction49.abs();
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction52.abs();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction52.multiply((int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction52.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction47.multiply(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction26.divide(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction16.multiply(fraction58);
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
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(fractionField34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertNotNull(fractionField51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 100);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.abs();
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
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction7);
        double double10 = fraction7.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.reciprocal();
        float float9 = fraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.divide(200);
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.subtract(fraction15);
        short short19 = fraction15.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction9.subtract((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.multiply(fraction13);
        double double15 = fraction0.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        java.lang.String str6 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.subtract((-31));
        double double10 = fraction9.doubleValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 3" + "'", str6, "1 / 3");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 31.333333333333332d + "'", double10 == 31.333333333333332d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 70, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 70 to fraction (-69/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        int int15 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction(5, (-99));
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.add((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str22 = fraction21.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.add(10);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.abs();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction20.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction3.subtract(fraction20);
        int int32 = fraction3.getDenominator();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 / 4" + "'", str22, "1 / 4");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        int int10 = fraction6.getDenominator();
        byte byte11 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double31 = fraction30.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction30.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction30.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction29.subtract(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction42 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        int int43 = fraction38.compareTo(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction25.multiply(fraction42);
        double double45 = fraction42.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction42.subtract((int) (short) 2);
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
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-500.0d) + "'", double45 == (-500.0d));
        org.junit.Assert.assertNotNull(fraction47);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        double double26 = fraction25.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long29 = fraction28.longValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.multiply(fraction30);
        int int32 = fraction31.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction36 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double37 = fraction36.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction31.divide(fraction36);
        java.lang.Object obj39 = null;
        boolean boolean40 = fraction36.equals(obj39);
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int42 = fraction41.intValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction41.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction44.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction44.divide((-1));
        int int49 = fraction48.intValue();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction36.divide(fraction48);
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int52 = fraction51.intValue();
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction51.multiply(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction51.abs();
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction36.multiply(fraction51);
        int int57 = fraction56.intValue();
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction25.subtract(fraction56);
        byte byte59 = fraction56.byteValue();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.014285714285714285d) + "'", double26 == (-0.014285714285714285d));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 7500.0d + "'", double37 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-75) + "'", int57 == (-75));
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) -75 + "'", byte59 == (byte) -75);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        java.lang.Class<?> wildcardClass4 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply((int) (byte) 1);
        int int16 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.divide(fraction12);
        java.lang.Class<?> wildcardClass18 = fraction17.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.add(6);
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
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        byte byte23 = fraction12.byteValue();
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
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        org.apache.commons.math3.fraction.FractionField fractionField26 = fraction24.getField();
        int int27 = fraction20.compareTo(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction31 = new org.apache.commons.math3.fraction.Fraction((-20.0d), (double) 101.0f, 0);
        boolean boolean32 = fraction24.equals((java.lang.Object) 101.0f);
        java.lang.Class<?> wildcardClass33 = fraction24.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 2L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 2 to fraction (-1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 116, (int) (short) 9);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(20, (int) (short) 75);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add((int) (short) 10);
        int int4 = fraction3.getDenominator();
        float float5 = fraction3.floatValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 20.0f + "'", float5 == 20.0f);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(75, 4950);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.subtract((int) (byte) 32);
        short short6 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -31 + "'", short6 == (short) -31);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        java.lang.String str4 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double9 = fraction8.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        int int17 = fraction10.compareTo(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.abs();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int20 = fraction19.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.add((int) '#');
        boolean boolean24 = fraction19.equals((java.lang.Object) fraction21);
        long long25 = fraction21.longValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double30 = fraction29.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.negate();
        int int33 = fraction18.compareTo(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction8.subtract(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction0.divide(fraction34);
        long long36 = fraction35.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 7500.0d + "'", double9 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 4" + "'", str11, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7500.0d + "'", double30 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        short short19 = fraction18.shortValue();
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
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        boolean boolean11 = fraction6.equals((java.lang.Object) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction9.subtract(fraction12);
        int int15 = fraction9.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction9.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction5.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction20.multiply(fraction23);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 74, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 74/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, (int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((-20.0d), (double) 101.0f, 0);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        double double8 = fraction0.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) -31, (int) (byte) 100);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 76, (int) (byte) 116);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 76 to fraction (-75/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide((-3));
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.reciprocal();
        int int18 = fraction16.intValue();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-60.0d), (-50.0d), (int) (short) 75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -60 to fraction (61/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (byte) 8);
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction7.getField();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 100.0f, (double) (short) -10, (int) (short) 51);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, 0.25d, 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long10 = fraction9.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction9.getField();
        long long12 = fraction9.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.divide(fraction9);
        int int14 = fraction13.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction15.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction13.subtract(fraction21);
        int int24 = fraction3.compareTo(fraction13);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 150L, (-3));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 150 to fraction (-149/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-6L));
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 116);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(10033.333333333332d);
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 49 + "'", byte2 == (byte) 49);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) -9, 4950);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -9 to fraction (-9,223,372,036,854,775,798/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        double double2 = fraction0.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply((int) (short) 21);
        int int21 = fraction17.intValue();
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        java.lang.String str7 = fraction6.toString();
        double double8 = fraction6.doubleValue();
        short short9 = fraction6.shortValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 2 + "'", short9 == (short) 2);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1), (double) (byte) 3, 3);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        boolean boolean11 = fraction6.equals((java.lang.Object) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction9.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.divide(200);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction3.subtract(fraction14);
        java.lang.Class<?> wildcardClass19 = fraction14.getClass();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, 51);
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(200);
        java.lang.Class<?> wildcardClass6 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.abs();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-4), 1000000.0d, 41);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(60, (-1));
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction(35, 10);
        int int8 = fraction4.compareTo(fraction7);
        int int9 = fraction3.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((double) 2L);
        boolean boolean12 = fraction3.equals((java.lang.Object) fraction11);
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
        java.lang.String str37 = fraction30.toString();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction30.divide((-59));
        int int40 = fraction11.compareTo(fraction39);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-1" + "'", str37, "-1");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (-59));
        int int3 = fraction2.getNumerator();
        byte byte4 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 9);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        java.lang.String str2 = fraction0.toString();
        long long3 = fraction0.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        byte byte5 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 / 3" + "'", str2, "1 / 3");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((int) '#');
        java.lang.String str8 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        int int10 = fraction5.compareTo(fraction9);
        boolean boolean11 = fraction3.equals((java.lang.Object) fraction9);
        int int12 = fraction9.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0.0d);
        double double2 = fraction1.percentageValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fraction3.compareTo(fraction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.negate();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction24.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction34.add((int) '#');
        boolean boolean37 = fraction32.equals((java.lang.Object) fraction34);
        long long38 = fraction34.longValue();
        org.apache.commons.math3.fraction.Fraction fraction42 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double43 = fraction42.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction34.subtract(fraction42);
        int int45 = fraction31.compareTo(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction49 = new org.apache.commons.math3.fraction.Fraction((-20.0d), (double) 101.0f, 0);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction31.multiply(fraction49);
        boolean boolean51 = fraction8.equals((java.lang.Object) fraction49);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction49.reciprocal();
        java.lang.Class<?> wildcardClass53 = fraction52.getClass();
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
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 7500.0d + "'", double43 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        org.apache.commons.math3.fraction.Fraction fraction41 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction41.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction43.subtract((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction12.add(fraction43);
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
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(200);
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction2.getField();
        byte byte6 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 35 + "'", byte6 == (byte) 35);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        byte byte1 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.subtract(fraction17);
        int int20 = fraction15.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction15.divide(fraction21);
        float float25 = fraction21.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.divide((int) '4');
        double double30 = fraction29.doubleValue();
        int int31 = fraction21.compareTo(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction13.divide(fraction21);
        int int33 = fraction13.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction13.add((int) (short) -100);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.014423076923076924d + "'", double30 == 0.014423076923076924d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(fraction35);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) '#', (double) (short) 100, 200);
        long long4 = fraction3.longValue();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(800, (int) (byte) -100);
        double double3 = fraction2.percentageValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-800.0d) + "'", double3 == (-800.0d));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(70, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 70/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        int int10 = fraction4.compareTo(fraction9);
        double double11 = fraction4.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 34.5d + "'", double11 == 34.5d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(35);
        float float2 = fraction1.floatValue();
        float float3 = fraction1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 35);
        double double5 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.add((int) '#');
        boolean boolean11 = fraction6.equals((java.lang.Object) fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction2.add(fraction15);
        byte byte17 = fraction16.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 2" + "'", str13, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 9 + "'", byte17 == (byte) 9);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(800, 101);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(1);
        double double7 = fraction6.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        double double4 = fraction0.doubleValue();
        double double5 = fraction0.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25d + "'", double4 == 0.25d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 25.0d + "'", double5 == 25.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        java.lang.Class<?> wildcardClass11 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction19.abs();
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
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 75);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 37, 200);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction7.multiply(fraction17);
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction18.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction20.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction28 = new org.apache.commons.math3.fraction.Fraction(60, (-1));
        double double29 = fraction28.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction24.add(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.add(1);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double34 = fraction33.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str36 = fraction35.toString();
        org.apache.commons.math3.fraction.FractionField fractionField37 = fraction35.getField();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction33.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction38.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int42 = fraction41.intValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction41.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction44.negate();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction44.negate();
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int48 = fraction47.intValue();
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction47.multiply(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction50.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction52.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction44.multiply(fraction54);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction40.subtract(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction40.abs();
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction30.add(fraction40);
        boolean boolean59 = fraction2.equals((java.lang.Object) fraction40);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-60.0d) + "'", double29 == (-60.0d));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1 / 2" + "'", str36, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(5, (-99));
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) (byte) 32);
        short short5 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 31 + "'", short5 == (short) 31);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(35);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        boolean boolean8 = fraction3.equals((java.lang.Object) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        int int16 = fraction9.compareTo(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction3.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide((-1));
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction1.multiply(fraction19);
        int int21 = fraction19.getDenominator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.negate();
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10, 35);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.divide(fraction5);
        double double7 = fraction5.doubleValue();
        boolean boolean9 = fraction5.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2857142857142857d + "'", double7 == 0.2857142857142857d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.multiply((int) (byte) 20);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double19 = fraction18.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str21 = fraction20.toString();
        org.apache.commons.math3.fraction.FractionField fractionField22 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction18.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str27 = fraction26.toString();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction31.negate();
        int int33 = fraction26.compareTo(fraction32);
        float float34 = fraction26.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField35 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction23.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction26.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField38 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction26.subtract(fraction41);
        int int43 = fraction17.compareTo(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str45 = fraction44.toString();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction44.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction50 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction44.multiply(fraction50);
        int int52 = fraction44.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction17.subtract(fraction44);
        org.apache.commons.math3.fraction.FractionField fractionField54 = fraction53.getField();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 / 2" + "'", str21, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1 / 4" + "'", str27, "1 / 4");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.25f + "'", float34 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fractionField38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1 / 4" + "'", str45, "1 / 4");
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fractionField54);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        float float5 = fraction0.floatValue();
        byte byte6 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        int int9 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        int int15 = fraction10.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int17 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction10.divide(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction16.abs();
        org.apache.commons.math3.fraction.Fraction fraction22 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long23 = fraction22.longValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str27 = fraction26.toString();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.subtract(fraction26);
        int int29 = fraction24.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int31 = fraction30.intValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction24.divide(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction22.add(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction24.subtract((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction36.divide(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int42 = fraction41.intValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str44 = fraction43.toString();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction41.subtract(fraction43);
        int int46 = fraction41.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction41.abs();
        boolean boolean48 = fraction40.equals((java.lang.Object) fraction47);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction16.divide(fraction40);
        int int50 = fraction3.compareTo(fraction40);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1 / 4" + "'", str27, "1 / 4");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1 / 4" + "'", str44, "1 / 4");
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2);
        java.lang.String str5 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-99" + "'", str5, "-99");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 103, (int) (short) -802);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 103 to fraction (9,223,372,036,854,775,706/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        double double15 = fraction9.percentageValue();
        java.lang.String str16 = fraction9.toString();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 25.0d + "'", double15 == 25.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 32);
        double double2 = fraction1.percentageValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3200.0d + "'", double2 == 3200.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 3, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 3/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction4.add((int) (byte) -100);
        long long19 = fraction4.longValue();
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.divide(2);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction6.divide((int) (byte) 20);
        int int15 = fraction6.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(80.0d, 13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 80 to fraction (-79/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(76, 203);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(200, 1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.subtract(50);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double9 = fraction8.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int19 = fraction18.getNumerator();
        long long20 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction8.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction18.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.add((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction7.divide(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = new org.apache.commons.math3.fraction.Fraction((double) 3L);
        org.apache.commons.math3.fraction.Fraction fraction33 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.subtract(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction35.negate();
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.add((int) '#');
        boolean boolean42 = fraction37.equals((java.lang.Object) fraction39);
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int44 = fraction43.intValue();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction43.multiply(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction43.abs();
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int49 = fraction48.intValue();
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction48.multiply(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction53 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long54 = fraction53.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField55 = fraction53.getField();
        long long56 = fraction53.longValue();
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction50.divide(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction47.add(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction39.add(fraction47);
        boolean boolean60 = fraction35.equals((java.lang.Object) fraction59);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction30.divide(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction7.divide(fraction61);
        byte byte63 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 100L + "'", long54 == 100L);
        org.junit.Assert.assertNotNull(fractionField55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L + "'", long56 == 100L);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) -50 + "'", byte63 == (byte) -50);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-399), (int) (byte) 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -399 to fraction (-9,223,372,036,854,775,408/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 5);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        float float15 = fraction14.floatValue();
        int int16 = fraction14.getDenominator();
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
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.021428572f + "'", float15 == 0.021428572f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 140 + "'", int16 == 140);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction1.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.negate();
        short short11 = fraction9.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 25 + "'", short11 == (short) 25);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 10, (double) (byte) -9, 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 800, (-101));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(100.02142857142857d);
        double double2 = fraction1.doubleValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.02142857142857d + "'", double2 == 100.02142857142857d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(200);
        int int8 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction5.multiply(140);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.add((int) (byte) 32);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 800 + "'", int8 == 800);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(35);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        boolean boolean11 = fraction6.equals((java.lang.Object) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.negate();
        int int19 = fraction12.compareTo(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction6.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str22 = fraction21.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.multiply((int) (short) 100);
        long long27 = fraction26.longValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction18.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction31 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction31.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction35.subtract(3);
        boolean boolean38 = fraction18.equals((java.lang.Object) fraction35);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction5.divide(fraction35);
        int int40 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction1.multiply(fraction5);
        int int42 = fraction41.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 / 4" + "'", str22, "1 / 4");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 800L + "'", long27 == 800L);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 350 + "'", int42 == 350);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-1.0d), (double) (short) 192, (int) (short) 101);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 75, (double) (byte) 32, 4);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, 0.25d, 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.subtract(fraction5);
        int int7 = fraction5.intValue();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 76, (double) (byte) -75, (-101));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 76 to fraction (-75/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 3);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction(100, (-10));
        boolean boolean5 = fraction1.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        java.lang.String str5 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.add((int) '#');
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.divide(fraction6);
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.multiply(fraction16);
        short short18 = fraction16.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1 / 2" + "'", str5, "-1 / 2");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 / 5" + "'", str9, "3 / 5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-5 / 6" + "'", str11, "-5 / 6");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -3 + "'", short18 == (short) -3);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        int int13 = fraction10.getDenominator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract(3);
        double double9 = fraction6.percentageValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 13333.333333333334d + "'", double9 == 13333.333333333334d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        boolean boolean18 = fraction13.equals((java.lang.Object) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        int int26 = fraction19.compareTo(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction13.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.divide((-3));
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction29.reciprocal();
        boolean boolean31 = fraction12.equals((java.lang.Object) fraction30);
        long long32 = fraction30.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 / 4" + "'", str20, "1 / 4");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-6L) + "'", long32 == (-6L));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.abs();
        java.lang.String str15 = fraction14.toString();
        int int16 = fraction14.intValue();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "75" + "'", str15, "75");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 75 + "'", int16 == 75);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-10));
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        int int15 = fraction10.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int17 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction10.divide(fraction16);
        float float20 = fraction16.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str25 = fraction24.toString();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction26.subtract(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int35 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction37.negate();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction30.subtract(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction41 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long42 = fraction41.longValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction41.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction39.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction16.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction7.divide(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction1.subtract(fraction47);
        boolean boolean50 = fraction47.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 / 4" + "'", str25, "1 / 4");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long28 = fraction27.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField29 = fraction27.getField();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.abs();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.abs();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.multiply((int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction25.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction4.divide(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction38 = new org.apache.commons.math3.fraction.Fraction((-0.5d));
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int41 = fraction40.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction40.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction39.multiply(fraction43);
        java.lang.String str45 = fraction43.toString();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction43.negate();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction38.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction4.subtract(fraction38);
        org.apache.commons.math3.fraction.FractionField fractionField49 = fraction38.getField();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(fractionField29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1 / 3" + "'", str45, "1 / 3");
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fractionField49);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.subtract(fraction8);
        short short12 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.abs();
        int int15 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double17 = fraction16.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction16.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str25 = fraction24.toString();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        int int27 = fraction22.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction22.divide(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction16.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int35 = fraction34.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction33.multiply(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction16.divide(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction10.multiply(fraction39);
        double double41 = fraction40.percentageValue();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 75 + "'", int15 == 75);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 / 4" + "'", str25, "1 / 4");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 22500.0d + "'", double41 == 22500.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        byte byte8 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 66);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction4.getField();
        byte byte7 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.divide(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str18 = fraction17.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.subtract(fraction17);
        int int20 = fraction15.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction15.divide(fraction21);
        float float25 = fraction21.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField26 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction27.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction32.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction35.negate();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction35.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction31.subtract(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int40 = fraction39.intValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction39.multiply(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction42.negate();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction35.subtract(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction46 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long47 = fraction46.longValue();
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction46.multiply(fraction48);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction44.multiply(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction21.multiply(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction12.divide(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction51.subtract((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction2.divide(fraction51);
        byte byte56 = fraction51.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1 / 4" + "'", str30, "1 / 4");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 100 + "'", byte56 == (byte) 100);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(200);
        int int8 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction5.multiply(140);
        int int11 = fraction10.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 800 + "'", int8 == 800);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        double double18 = fraction17.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply((int) (byte) 20);
        double double21 = fraction17.percentageValue();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        float float3 = fraction2.floatValue();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3 == (-100.0f));
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -100 + "'", short4 == (short) -100);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.add((int) '#');
        boolean boolean14 = fraction9.equals((java.lang.Object) fraction11);
        long long15 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double20 = fraction19.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction11.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.negate();
        int int23 = fraction8.compareTo(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.divide(208);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double27 = fraction26.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction26.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction26.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction26.subtract(51);
        boolean boolean36 = fraction22.equals((java.lang.Object) 51);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7500.0d + "'", double20 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-10));
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        int int15 = fraction10.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int17 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction10.divide(fraction16);
        float float20 = fraction16.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str25 = fraction24.toString();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction26.subtract(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int35 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction37.negate();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction30.subtract(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction41 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long42 = fraction41.longValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction41.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction39.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction16.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction7.divide(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction1.subtract(fraction47);
        int int49 = fraction47.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 / 4" + "'", str25, "1 / 4");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 116, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 116/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) ' ');
        int int8 = fraction0.compareTo(fraction7);
        byte byte9 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 4" + "'", str5, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 8 + "'", byte9 == (byte) 8);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean7 = fraction1.equals((java.lang.Object) fraction6);
        float float8 = fraction1.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.multiply(fraction10);
        float float12 = fraction11.floatValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-31), 65);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -31 to fraction (-9,223,372,036,854,775,776/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(200.0d, (double) (short) -3, 50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 200 to fraction (-199/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.divide((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long7 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.add(fraction9);
        boolean boolean12 = fraction9.equals((java.lang.Object) false);
        int int13 = fraction9.getNumerator();
        int int14 = fraction9.getDenominator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-59.75d));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(100);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        int int3 = fraction1.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(101.0d);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-10), (int) (short) -198);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 35, 139);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 75, (int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide(800);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        java.lang.String str4 = fraction0.toString();
        java.lang.String str5 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.multiply((int) (byte) 37);
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 4" + "'", str5, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.add((int) (short) 100);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.add(fraction15);
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.add((int) '#');
        boolean boolean23 = fraction18.equals((java.lang.Object) fraction20);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str25 = fraction24.toString();
        org.apache.commons.math3.fraction.FractionField fractionField26 = fraction24.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction18.multiply(fraction24);
        int int28 = fraction24.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction16.add(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction10.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction24.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "101" + "'", str17, "101");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 / 2" + "'", str25, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add((int) (short) 10);
        int int4 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double4 = fraction3.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        boolean boolean19 = fraction14.equals((java.lang.Object) fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str21 = fraction20.toString();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.negate();
        int int27 = fraction20.compareTo(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction14.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction14.multiply((int) (byte) 20);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double33 = fraction32.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str35 = fraction34.toString();
        org.apache.commons.math3.fraction.FractionField fractionField36 = fraction34.getField();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction32.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str41 = fraction40.toString();
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int43 = fraction42.intValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction42.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction45.negate();
        int int47 = fraction40.compareTo(fraction46);
        float float48 = fraction40.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField49 = fraction40.getField();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction37.subtract(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction40.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField52 = fraction40.getField();
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction53.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction40.subtract(fraction55);
        int int57 = fraction31.compareTo(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction58 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str59 = fraction58.toString();
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction58.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction64 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction58.multiply(fraction64);
        int int66 = fraction58.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction31.subtract(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction2.subtract(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction69 = fraction2.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 / 4" + "'", str21, "1 / 4");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1 / 2" + "'", str35, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1 / 4" + "'", str41, "1 / 4");
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.25f + "'", float48 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fractionField52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1 / 4" + "'", str59, "1 / 4");
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1.5f), (double) (byte) -100, (int) (short) -3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Unable to convert -1.5 to fraction after -3 iterations");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 49, (double) (byte) 0, (int) (byte) 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 49 to fraction (9,223,372,036,854,775,760/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(200);
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        int int13 = fraction6.compareTo(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.abs();
        int int15 = fraction2.compareTo(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction2.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction2.multiply((int) (short) 3);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        java.lang.String str4 = fraction3.toString();
        int int5 = fraction3.intValue();
        double double6 = fraction3.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((int) '#');
        boolean boolean12 = fraction7.equals((java.lang.Object) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction7.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction13.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((int) ' ', 10);
        double double22 = fraction21.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction18.add(fraction21);
        int int24 = fraction3.compareTo(fraction18);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2" + "'", str4, "2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 / 2" + "'", str14, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.2d + "'", double22 == 3.2d);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 100/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 10.333333f, (double) 0.25f, (-16));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Unable to convert 10.333 to fraction after -16 iterations");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.abs();
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        int int4 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(76);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction4.getField();
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
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction4.multiply(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int42 = fraction41.intValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction43.add((int) '#');
        boolean boolean46 = fraction41.equals((java.lang.Object) fraction43);
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str48 = fraction47.toString();
        org.apache.commons.math3.fraction.FractionField fractionField49 = fraction47.getField();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction41.multiply(fraction47);
        double double51 = fraction50.doubleValue();
        long long52 = fraction50.longValue();
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction36.add(fraction50);
        double double54 = fraction50.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1 / 2" + "'", str48, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-0.5d) + "'", double51 == (-0.5d));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-50.0d) + "'", double54 == (-50.0d));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) ' ');
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract(fraction9);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction23.multiply((-31));
        java.lang.String str34 = fraction33.toString();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-31 / 200" + "'", str34, "-31 / 200");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        java.lang.String str5 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.add((int) '#');
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.divide(fraction6);
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.subtract((-6));
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction10.divide((int) (byte) 4);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1 / 2" + "'", str5, "-1 / 2");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 / 5" + "'", str9, "3 / 5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-5 / 6" + "'", str11, "-5 / 6");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.add((int) '#');
        java.lang.String str3 = fraction0.toString();
        int int4 = fraction0.getNumerator();
        byte byte5 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3 / 5" + "'", str3, "3 / 5");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(10, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((-59));
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply((-10));
        int int7 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-0.2f));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) -1, (double) 50, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply((int) '#');
        java.lang.String str7 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double9 = fraction8.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int19 = fraction18.getNumerator();
        long long20 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction8.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction4.add(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction3.add(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.multiply((-31));
        java.lang.Class<?> wildcardClass27 = fraction24.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(200);
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.divide(800);
        double double8 = fraction7.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.04375d + "'", double8 == 0.04375d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply((int) (short) 51);
        java.lang.String str4 = fraction3.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "51" + "'", str4, "51");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.divide((-3));
        org.apache.commons.math3.fraction.Fraction fraction20 = new org.apache.commons.math3.fraction.Fraction((double) 101.0f, (double) 'a', (int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction21.abs();
        byte byte23 = fraction21.byteValue();
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
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0, 800);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-52), (double) (short) -2, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -52 to fraction (53/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 74);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0);
        double double2 = fraction1.percentageValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        double double17 = fraction4.percentageValue();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 75.0d + "'", double17 == 75.0d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add(140);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.add(75);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.add((int) '#');
        boolean boolean14 = fraction9.equals((java.lang.Object) fraction11);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction9.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction15.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.negate();
        int int27 = fraction20.compareTo(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction31 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.multiply(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction34.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction31.subtract(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction34.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction26.add(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction8.multiply(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction42.add((int) '#');
        int int45 = fraction42.getNumerator();
        int int46 = fraction8.compareTo(fraction42);
        double double47 = fraction8.doubleValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 2" + "'", str16, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-48.0d) + "'", double47 == (-48.0d));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(10);
        int int6 = fraction5.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-19) + "'", int6 == (-19));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        byte byte31 = fraction30.byteValue();
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
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) -31, (int) (short) 51);
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-0.60784316f) + "'", float3 == (-0.60784316f));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) -100, (int) (short) 51);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        double double24 = fraction21.doubleValue();
        byte byte25 = fraction21.byteValue();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-2.0d) + "'", double24 == (-2.0d));
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -2 + "'", byte25 == (byte) -2);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.divide((-25));
        double double9 = fraction8.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0044444444444444444d) + "'", double9 == (-0.0044444444444444444d));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.subtract(fraction6);
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction6.getField();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (int) (short) -100);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(13200.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 13,200 to fraction (-13,199/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long18 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        int int21 = fraction20.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double26 = fraction25.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction20.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction7.multiply(fraction27);
        java.lang.String str29 = fraction7.toString();
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
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 7500.0d + "'", double26 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-2 / 3" + "'", str29, "-2 / 3");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.divide((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.divide((int) (byte) 100);
        int int10 = fraction3.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        org.apache.commons.math3.fraction.Fraction fraction40 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction40.negate();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction41.multiply(3);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction43.abs();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction45.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction43.multiply(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction50.multiply(fraction51);
        double double53 = fraction50.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction45.divide(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction31.multiply(fraction50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction57 = fraction50.divide((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 20.0d + "'", double53 == 20.0d);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.divide(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.add(fraction7);
        int int11 = fraction7.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double13 = fraction12.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction12.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction12.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction12.subtract(fraction20);
        boolean boolean24 = fraction7.equals((java.lang.Object) fraction20);
        byte byte25 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 10 + "'", byte25 == (byte) 10);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction4);
        int int6 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.negate();
        int int8 = fraction7.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction9.subtract(fraction11);
        int int14 = fraction9.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction9.divide(fraction15);
        float float19 = fraction15.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str24 = fraction23.toString();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction21.subtract(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int27 = fraction26.intValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction29.negate();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction25.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int34 = fraction33.intValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction36.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction29.subtract(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction40 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long41 = fraction40.longValue();
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction40.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction38.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction15.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction7.divide(fraction45);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1 / 4" + "'", str24, "1 / 4");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        int int14 = fraction11.intValue();
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        short short6 = fraction4.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -100 + "'", short6 == (short) -100);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
        int int7 = fraction0.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.reciprocal();
        float float9 = fraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.divide(200);
        java.lang.Class<?> wildcardClass12 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.25f + "'", float9 == 0.25f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 1, 35);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction8);
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.subtract((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction2.divide(fraction12);
        short short14 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-1.0f), 139);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -1 to fraction (-9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction4);
        java.lang.String str6 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.subtract((int) (byte) -1);
        double double10 = fraction9.doubleValue();
        float float11 = fraction9.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 3" + "'", str6, "1 / 3");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6666666666666666d + "'", double10 == 0.6666666666666666d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.6666667f + "'", float11 == 0.6666667f);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 3, (-195137));
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        boolean boolean9 = fraction4.equals((java.lang.Object) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        int int17 = fraction10.compareTo(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction4.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction16.multiply((int) (short) 10);
        int int21 = fraction2.compareTo(fraction16);
        int int22 = fraction16.intValue();
        boolean boolean24 = fraction16.equals((java.lang.Object) 10.333333f);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 4" + "'", str11, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        int int20 = fraction19.intValue();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-99) + "'", int20 == (-99));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, (int) (byte) 4);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(0);
        short short6 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -100 + "'", short6 == (short) -100);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.divide(fraction9);
        java.lang.Object obj12 = null;
        boolean boolean13 = fraction9.equals(obj12);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.divide((-1));
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction9.divide(fraction21);
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction23.getField();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(60.0d, 20.0d, (int) (byte) 8);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(200);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        int int9 = fraction8.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-35), 4);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long28 = fraction27.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField29 = fraction27.getField();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.abs();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.abs();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.multiply((int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction25.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction4.divide(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction38 = new org.apache.commons.math3.fraction.Fraction((-0.5d));
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int41 = fraction40.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction40.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction39.multiply(fraction43);
        java.lang.String str45 = fraction43.toString();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction43.negate();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction38.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction4.subtract(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int50 = fraction49.intValue();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction51.add((int) '#');
        boolean boolean54 = fraction49.equals((java.lang.Object) fraction51);
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int56 = fraction55.intValue();
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction55.multiply(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction55.abs();
        org.apache.commons.math3.fraction.Fraction fraction60 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int61 = fraction60.intValue();
        org.apache.commons.math3.fraction.Fraction fraction62 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction60.multiply(fraction62);
        org.apache.commons.math3.fraction.Fraction fraction65 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long66 = fraction65.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField67 = fraction65.getField();
        long long68 = fraction65.longValue();
        org.apache.commons.math3.fraction.Fraction fraction69 = fraction62.divide(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction59.add(fraction62);
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction51.add(fraction59);
        long long72 = fraction71.longValue();
        org.apache.commons.math3.fraction.Fraction fraction73 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction74 = fraction71.add(fraction73);
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction74.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction76 = fraction75.abs();
        int int77 = fraction38.compareTo(fraction75);
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(fractionField29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1 / 3" + "'", str45, "1 / 3");
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 100L + "'", long66 == 100L);
        org.junit.Assert.assertNotNull(fractionField67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 100L + "'", long68 == 100L);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(140, (int) (short) 100);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.add((-16));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long6 = fraction5.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction5.getField();
        long long8 = fraction5.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.divide(fraction5);
        int int10 = fraction9.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction9.subtract(fraction17);
        double double20 = fraction9.percentageValue();
        int int21 = fraction9.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5d + "'", double20 == 0.5d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(51);
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 51 + "'", byte2 == (byte) 51);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add(140);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.add(75);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.add((int) '#');
        boolean boolean14 = fraction9.equals((java.lang.Object) fraction11);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction9.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction15.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.negate();
        int int27 = fraction20.compareTo(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction31 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.multiply(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction34.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction31.subtract(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction34.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction26.add(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction8.multiply(fraction40);
        double double42 = fraction40.doubleValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 2" + "'", str16, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        int int3 = fraction2.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.add(1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str9 = fraction8.toString();
        double double10 = fraction8.percentageValue();
        int int11 = fraction4.compareTo(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction4);
        java.lang.Class<?> wildcardClass13 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 2" + "'", str5, "1 / 2");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.subtract(fraction6);
        double double10 = fraction0.doubleValue();
        java.lang.Object obj11 = null;
        boolean boolean12 = fraction0.equals(obj11);
        java.lang.Class<?> wildcardClass13 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        java.lang.String str2 = fraction0.toString();
        long long3 = fraction0.longValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        int int5 = fraction0.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 / 3" + "'", str2, "1 / 3");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double18 = fraction17.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(2);
        int int21 = fraction17.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction16.multiply(fraction17);
        short short23 = fraction16.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 10, (-195137));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.divide((int) ' ');
        boolean boolean17 = fraction15.equals((java.lang.Object) 51L);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.negate();
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
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.add(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long20 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction17.multiply(fraction22);
        int int24 = fraction22.intValue();
        int int25 = fraction22.getDenominator();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (short) 66);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(6100.0d, (double) (byte) 1, 60);
        int int4 = fraction3.getNumerator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6100 + "'", int4 == 6100);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction3.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction18.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction17.divide(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int32 = fraction31.intValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str34 = fraction33.toString();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction31.subtract(fraction33);
        int int36 = fraction31.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.negate();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction31.divide(fraction37);
        float float41 = fraction37.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField42 = fraction37.getField();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int44 = fraction43.intValue();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str46 = fraction45.toString();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction43.subtract(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int49 = fraction48.intValue();
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction48.multiply(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction51.negate();
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction51.negate();
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction47.subtract(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int56 = fraction55.intValue();
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction55.multiply(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction58.negate();
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction51.subtract(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction62 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long63 = fraction62.longValue();
        org.apache.commons.math3.fraction.Fraction fraction64 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction62.multiply(fraction64);
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction60.multiply(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction37.multiply(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction28.divide(fraction67);
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction67.subtract((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction18.divide(fraction67);
        org.apache.commons.math3.fraction.FractionField fractionField72 = fraction18.getField();
        org.apache.commons.math3.fraction.Fraction fraction73 = fraction3.subtract(fraction18);
        int int74 = fraction18.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1 / 4" + "'", str34, "1 / 4");
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1 / 4" + "'", str46, "1 / 4");
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fractionField72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 3 + "'", int74 == 3);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(31);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.add(fraction12);
        int int15 = fraction12.getDenominator();
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction2.subtract(fraction12);
        java.lang.String str18 = fraction17.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 2" + "'", str13, "1 / 2");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 10);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        boolean boolean8 = fraction3.equals((java.lang.Object) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction3.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.add(3);
        boolean boolean18 = fraction1.equals((java.lang.Object) fraction15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(133.33333333333334d, (int) (byte) -5);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2600);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(35, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.divide(fraction7);
        byte byte9 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 3 + "'", byte9 == (byte) 3);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -1, (int) (byte) 3);
        double double3 = fraction2.doubleValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.3333333333333333d) + "'", double3 == (-0.3333333333333333d));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        int int32 = fraction19.getDenominator();
        java.lang.String str33 = fraction19.toString();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "3 / 5" + "'", str33, "3 / 5");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        double double6 = fraction0.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-0.5d));
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply(fraction6);
        java.lang.String str8 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.multiply(fraction6);
        int int11 = fraction6.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 3" + "'", str8, "1 / 3");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction3.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((double) '#');
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction18.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction17.divide(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int32 = fraction31.intValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str34 = fraction33.toString();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction31.subtract(fraction33);
        int int36 = fraction31.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.negate();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction31.divide(fraction37);
        float float41 = fraction37.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField42 = fraction37.getField();
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int44 = fraction43.intValue();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str46 = fraction45.toString();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction43.subtract(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int49 = fraction48.intValue();
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction48.multiply(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction51.negate();
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction51.negate();
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction47.subtract(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int56 = fraction55.intValue();
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction55.multiply(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction58.negate();
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction51.subtract(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction62 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long63 = fraction62.longValue();
        org.apache.commons.math3.fraction.Fraction fraction64 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction62.multiply(fraction64);
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction60.multiply(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction37.multiply(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction28.divide(fraction67);
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction67.subtract((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction18.divide(fraction67);
        org.apache.commons.math3.fraction.FractionField fractionField72 = fraction18.getField();
        org.apache.commons.math3.fraction.Fraction fraction73 = fraction3.subtract(fraction18);
        int int74 = fraction73.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1 / 4" + "'", str34, "1 / 4");
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1 / 4" + "'", str46, "1 / 4");
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 100L + "'", long63 == 100L);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fractionField72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4 + "'", int74 == 4);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        int int5 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.divide(fraction6);
        int int10 = fraction9.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        int int10 = fraction4.compareTo(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction((-1), (int) (byte) 74);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction4.add(fraction13);
        int int15 = fraction14.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction4.add((int) (byte) -100);
        float float19 = fraction18.floatValue();
        java.lang.String str20 = fraction18.toString();
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-99.5f) + "'", float19 == (-99.5f));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-199 / 2" + "'", str20, "-199 / 2");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.lang.Class<?> wildcardClass13 = fraction8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int33 = fraction32.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction32.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction31.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction36.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction30.subtract(fraction37);
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
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.multiply((int) (byte) 20);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.abs();
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
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -5);
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide((-3));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.abs();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.FractionField fractionField8 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(fraction7);
        long long10 = fraction7.longValue();
        double double11 = fraction7.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fractionField8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 100);
        long long6 = fraction5.longValue();
        int int7 = fraction5.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField9 = fraction8.getField();
        long long10 = fraction8.longValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.multiply(31);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.multiply((int) (short) 192);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 800L + "'", long6 == 800L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        short short32 = fraction19.shortValue();
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
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 0 + "'", short32 == (short) 0);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-802), (int) (short) 300);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -802 to fraction (803/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        java.lang.String str6 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.add(fraction4);
        double double8 = fraction7.percentageValue();
        byte byte9 = fraction7.byteValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 3" + "'", str6, "1 / 3");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10033.333333333332d + "'", double8 == 10033.333333333332d);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.subtract((-1));
        boolean boolean11 = fraction0.equals((java.lang.Object) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction0.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int5 = fraction4.getNumerator();
        long long6 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction4.add(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        int int16 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction14.add(10);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int20 = fraction19.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.add((int) '#');
        boolean boolean24 = fraction19.equals((java.lang.Object) fraction21);
        java.lang.String str25 = fraction21.toString();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction18.multiply(fraction21);
        boolean boolean27 = fraction13.equals((java.lang.Object) fraction21);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double29 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str35 = fraction34.toString();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction32.subtract(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction37.multiply(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction40.negate();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction40.negate();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction36.subtract(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction47 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction47.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction36.add(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction28.subtract(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction13.add(fraction51);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3 / 5" + "'", str25, "3 / 5");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1 / 4" + "'", str35, "1 / 4");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.subtract(fraction8);
        int int11 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction0.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction16.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 58, (int) (short) 2);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        short short17 = fraction4.shortValue();
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
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-97.0f), (int) (byte) 20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -97 to fraction (-9,223,372,036,854,775,710/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.add(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.abs();
        int int10 = fraction9.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(800, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 800/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction1.multiply(203);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.subtract(76);
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(800, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(3);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply(fraction13);
        double double15 = fraction12.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction7.divide(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction12.reciprocal();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(41, (int) (short) 35);
        int int3 = fraction2.getDenominator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-75), (int) '#');
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str28 = fraction27.toString();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.add(1);
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str32 = fraction31.toString();
        double double33 = fraction31.percentageValue();
        int int34 = fraction27.compareTo(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction26.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction35.divide((int) (short) -2);
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
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1 / 2" + "'", str28, "1 / 2");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1 / 2" + "'", str32, "1 / 2");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 50.0d + "'", double33 == 50.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        double double27 = fraction14.percentageValue();
        int int28 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction14.divide((int) (short) 20);
        short short31 = fraction14.shortValue();
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-41.66666666666667d) + "'", double27 == (-41.66666666666667d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 0 + "'", short31 == (short) 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0.02f, (int) (short) 800);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(0);
        byte byte5 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        java.lang.Class<?> wildcardClass17 = fraction16.getClass();
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
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0);
        double double2 = fraction1.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        boolean boolean8 = fraction3.equals((java.lang.Object) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.add(4);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.divide(fraction3);
        float float12 = fraction11.floatValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.reciprocal();
        int int16 = fraction12.getDenominator();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(60, (-1));
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        double double4 = fraction2.percentageValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-6000.0d) + "'", double4 == (-6000.0d));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(60.0d, (-0.014285714285714285d), 75);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 60 to fraction (-59/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.divide((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction1.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.reciprocal();
        float float24 = fraction23.floatValue();
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
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0012507817f) + "'", float24 == (-0.0012507817f));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(1, 101);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        int int6 = fraction0.getNumerator();
        byte byte7 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 5, (int) (short) 127);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 5 to fraction (9,223,372,036,854,775,804/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply((int) (byte) 10);
        java.lang.String str10 = fraction9.toString();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-4850" + "'", str10, "-4850");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) -10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 3);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 192);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (short) 2, (int) (short) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 2 to fraction (-1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -100, (int) (short) 10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        int int27 = fraction25.getNumerator();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60 + "'", int27 == 60);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(1);
        float float7 = fraction6.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(50);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.subtract((-3));
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str21 = fraction20.toString();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.add(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction13.multiply(fraction20);
        long long24 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField28 = fraction27.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.divide(fraction27);
        boolean boolean30 = fraction20.equals((java.lang.Object) fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction6.divide(fraction29);
        long long33 = fraction32.longValue();
        short short34 = fraction32.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 / 2" + "'", str21, "1 / 2");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 0 + "'", short34 == (short) 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        double double4 = fraction0.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply((int) ' ');
        java.lang.String str12 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction7.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int17 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction19.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction33 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 31);
        java.lang.String str34 = fraction33.toString();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction19.divide(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int37 = fraction36.intValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.multiply(fraction38);
        int int40 = fraction39.intValue();
        int int41 = fraction33.compareTo(fraction39);
        int int42 = fraction15.compareTo(fraction39);
        short short43 = fraction15.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 / 4" + "'", str12, "1 / 4");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1 / 2" + "'", str34, "-1 / 2");
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 24 + "'", short43 == (short) 24);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(1);
        float float7 = fraction6.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(50);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.subtract((-3));
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction6.divide(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction6.multiply((-127));
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.abs();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction19.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int30 = fraction29.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.abs();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction19.add(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int35 = fraction34.intValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str37 = fraction36.toString();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction34.subtract(fraction36);
        int int39 = fraction34.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int41 = fraction40.intValue();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction40.negate();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction34.divide(fraction40);
        float float44 = fraction40.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField46 = fraction45.getField();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.divide((int) '4');
        double double49 = fraction48.doubleValue();
        int int50 = fraction40.compareTo(fraction48);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction32.divide(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction32.negate();
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction6.add(fraction52);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 4" + "'", str3, "1 / 4");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1 / 4" + "'", str37, "1 / 4");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fractionField46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.014423076923076924d + "'", double49 == 0.014423076923076924d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        int int19 = fraction18.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int28 = fraction27.getNumerator();
        long long29 = fraction27.longValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction23.add(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str33 = fraction32.toString();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction32.multiply((int) ' ');
        java.lang.String str36 = fraction32.toString();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction30.add(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction30.abs();
        java.lang.String str39 = fraction30.toString();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction20.multiply(fraction30);
        org.apache.commons.math3.fraction.FractionField fractionField41 = fraction30.getField();
        int int42 = fraction9.compareTo(fraction30);
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1 / 4" + "'", str33, "1 / 4");
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1 / 4" + "'", str36, "1 / 4");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-2 / 3" + "'", str39, "-2 / 3");
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fractionField41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int15 = fraction14.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        int int26 = fraction19.compareTo(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply((int) (byte) 1);
        int int29 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction11.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction7.multiply(fraction11);
        int int32 = fraction11.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 4" + "'", str9, "1 / 4");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 / 4" + "'", str20, "1 / 4");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 35);
        double double5 = fraction2.doubleValue();
        short short6 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        int int25 = fraction23.intValue();
        double double26 = fraction23.percentageValue();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10100.0d + "'", double26 == 10100.0d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 20, (-1));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) -10, 139);
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.junit.Assert.assertNotNull(fractionField3);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.divide((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.divide((int) (byte) 100);
        long long10 = fraction3.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE;
        int int13 = fraction12.intValue();
        boolean boolean14 = fraction4.equals((java.lang.Object) int13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction4.negate();
        float float16 = fraction15.floatValue();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-0.5f));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add(1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(1);
        double double6 = fraction3.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 2" + "'", str1, "1 / 2");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 150.0d + "'", double6 == 150.0d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean13 = fraction7.equals((java.lang.Object) fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE;
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction12.divide(fraction16);
        boolean boolean18 = fraction5.equals((java.lang.Object) fraction12);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) -1, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction12.multiply(fraction21);
        java.lang.Class<?> wildcardClass23 = fraction12.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        int int5 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.divide(fraction9);
        java.lang.Object obj12 = null;
        boolean boolean13 = fraction9.equals(obj12);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.divide((-1));
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction9.divide(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.abs();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction9.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.add((int) '#');
        double double32 = fraction31.percentageValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7500.0d + "'", double10 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-4000.0d) + "'", double32 == (-4000.0d));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.negate();
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(1);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.abs();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(0);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction13.subtract(fraction17);
        boolean boolean22 = fraction8.equals((java.lang.Object) fraction13);
        int int23 = fraction8.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 35);
        double double5 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction2.getField();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(fractionField6);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.reciprocal();
        short short5 = fraction4.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction10.multiply((-16));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7500.0d + "'", double11 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(200);
        short short5 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -165 + "'", short5 == (short) -165);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        java.lang.String str20 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction8.abs();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-3 / 2" + "'", str20, "-3 / 2");
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 4950, (int) (byte) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 4,950 to fraction (-4,949/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        java.lang.String str4 = fraction0.toString();
        java.lang.String str5 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.multiply((int) (byte) 37);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.subtract(1);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(0);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction21.subtract(fraction25);
        boolean boolean30 = fraction16.equals((java.lang.Object) fraction21);
        int int31 = fraction7.compareTo(fraction21);
        double double32 = fraction7.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 4" + "'", str5, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 925.0d + "'", double32 == 925.0d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        byte byte5 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(208, 99);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        java.lang.String str5 = fraction2.toString();
        long long6 = fraction2.longValue();
        java.lang.Class<?> wildcardClass7 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1 / 2" + "'", str5, "-1 / 2");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-19), (-16));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        double double8 = fraction7.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.85d + "'", double8 == 0.85d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.add(50);
        byte byte19 = fraction15.byteValue();
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
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 2 + "'", byte19 == (byte) 2);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.14285714285714285d, 34.5d, (int) (byte) 75);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide((int) '#');
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
        float float18 = fraction14.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int21 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction20.subtract(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction24.subtract(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction32.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction35.negate();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction28.subtract(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction39 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long40 = fraction39.longValue();
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction39.multiply(fraction41);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction37.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction14.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction5.divide(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction46 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double47 = fraction46.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction46.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction46.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction52 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int53 = fraction52.intValue();
        org.apache.commons.math3.fraction.Fraction fraction54 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction52.multiply(fraction54);
        org.apache.commons.math3.fraction.Fraction fraction56 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int57 = fraction56.getNumerator();
        long long58 = fraction56.longValue();
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction52.add(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction46.subtract(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction56.add((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction44.add(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction44.divide((-6));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 4" + "'", str23, "1 / 4");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction65);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        java.lang.Class<?> wildcardClass3 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean13 = fraction7.equals((java.lang.Object) fraction12);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE;
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction12.divide(fraction16);
        boolean boolean18 = fraction5.equals((java.lang.Object) fraction12);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) -1, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction12.multiply(fraction21);
        java.lang.Class<?> wildcardClass23 = fraction22.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.negate();
        int int12 = fraction5.compareTo(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction5.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction2.divide(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 20, (int) (short) -2);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-2.0d));
        boolean boolean4 = fraction0.equals((java.lang.Object) (-2.0d));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-396.0d), (double) (short) 31, 8);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long11 = fraction10.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.abs();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply((int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction8.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long21 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply(fraction22);
        int int24 = fraction23.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction28 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double29 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction23.divide(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.add(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction36 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long37 = fraction36.longValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int40 = fraction39.getNumerator();
        java.lang.String str41 = fraction39.toString();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction36.add(fraction39);
        double double43 = fraction42.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction32.subtract(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction46 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction46.add((int) (short) 10);
        int int49 = fraction48.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction32.divide(fraction48);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction8.subtract(fraction32);
        byte byte52 = fraction51.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7500.0d + "'", double29 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1 / 3" + "'", str41, "1 / 3");
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10033.333333333332d + "'", double43 == 10033.333333333332d);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) 1 + "'", byte52 == (byte) 1);
    }
}

