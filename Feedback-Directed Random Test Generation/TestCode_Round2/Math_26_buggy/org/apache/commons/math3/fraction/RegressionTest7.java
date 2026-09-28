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
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (short) -100);
        int int3 = fraction0.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-39.6f), 1010.0d, 14);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) (byte) 75);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) -53);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, (-20.0d), 208);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        int int44 = fraction42.getDenominator();
        int int45 = fraction3.compareTo(fraction42);
        byte byte46 = fraction42.byteValue();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 208 + "'", int44 == 208);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 0 + "'", byte46 == (byte) 0);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 75, (-101));
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.negate();
        java.lang.String str8 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((int) '#');
        java.lang.String str12 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction6.divide(fraction9);
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.subtract((-6));
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.negate();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str26 = fraction25.toString();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.add(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction18.multiply(fraction25);
        long long29 = fraction25.longValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int31 = fraction30.intValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField33 = fraction32.getField();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.divide(fraction32);
        boolean boolean35 = fraction25.equals((java.lang.Object) fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction16.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction2.multiply(fraction16);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 / 2" + "'", str8, "-1 / 2");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3 / 5" + "'", str12, "3 / 5");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-5 / 6" + "'", str14, "-5 / 6");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1 / 2" + "'", str26, "1 / 2");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fractionField33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-3619));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 3, (double) 35, (-31));
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.divide((int) (short) 25);
        float float6 = fraction5.floatValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.12f + "'", float6 == 0.12f);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(9.0d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.negate();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.negate();
        org.apache.commons.math3.fraction.FractionField fractionField10 = fraction7.getField();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.multiply(2);
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int23 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.negate();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction21.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int30 = fraction29.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction32.negate();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction25.subtract(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction15.add(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction7.divide(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction0.add(fraction36);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fractionField10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-198" + "'", str16, "-198");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 / 4" + "'", str20, "1 / 4");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.add(140);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.add(75);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int10 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply((int) ' ');
        int int17 = fraction9.compareTo(fraction16);
        int int18 = fraction9.intValue();
        int int19 = fraction8.compareTo(fraction9);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 / 4" + "'", str14, "1 / 4");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply((int) '#');
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction4.getField();
        boolean boolean8 = fraction3.equals((java.lang.Object) fraction4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((int) (byte) 74);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double13 = fraction12.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction12.add((int) (short) 100);
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
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction12.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double30 = fraction29.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply(2);
        int int33 = fraction29.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction28.multiply(fraction29);
        double double35 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.add(357);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction11.divide(fraction39);
        long long41 = fraction40.longValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
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
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-25.0d) + "'", double35 == (-25.0d));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 18L + "'", long41 == 18L);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction4.negate();
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
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        long long11 = fraction9.longValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction9.subtract((-80));
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 5);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction8.subtract(fraction13);
        double double15 = fraction14.doubleValue();
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
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-5.25d) + "'", double15 == (-5.25d));
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) '#');
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction2);
        long long6 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(fraction16);
        boolean boolean18 = fraction13.equals((java.lang.Object) fraction16);
        boolean boolean19 = fraction2.equals((java.lang.Object) boolean18);
        long long20 = fraction2.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.add((int) '#');
        boolean boolean26 = fraction21.equals((java.lang.Object) fraction23);
        java.lang.String str27 = fraction23.toString();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str31 = fraction30.toString();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction28.subtract(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.multiply(1);
        float float35 = fraction34.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(50);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction34.subtract((-3));
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction23.add(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction40.negate();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction41.add(101);
        boolean boolean44 = fraction2.equals((java.lang.Object) 101);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction2.reciprocal();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "3 / 5" + "'", str27, "3 / 5");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1 / 4" + "'", str31, "1 / 4");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(fraction45);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.subtract(0);
        byte byte18 = fraction17.byteValue();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "5" + "'", str14, "5");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 5 + "'", byte18 == (byte) 5);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        int int4 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.abs();
        long long9 = fraction8.longValue();
        int int10 = fraction0.compareTo(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        java.lang.String str4 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(5);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long17 = fraction16.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction16.getField();
        long long19 = fraction16.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction13.divide(fraction16);
        int int21 = fraction20.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction22.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction28 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction22.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction20.subtract(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction34 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double35 = fraction34.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction30.subtract(fraction34);
        int int37 = fraction36.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction40 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f, (int) (short) 10);
        boolean boolean41 = fraction36.equals((java.lang.Object) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction10.add(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction0.divide(fraction10);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 4" + "'", str23, "1 / 4");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 7500.0d + "'", double35 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-195137) + "'", int37 == (-195137));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 8, (int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide((int) (short) 2);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double4 = fraction3.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        int int16 = fraction11.compareTo(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.reciprocal();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add(0);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(41, 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.add(fraction9);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        double double12 = fraction11.doubleValue();
        long long13 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction11);
        double double15 = fraction14.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.875d) + "'", double15 == (-0.875d));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-35), 97);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) 0.5f, (double) 35L, 200);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.add(fraction12);
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int17 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply(fraction18);
        boolean boolean20 = fraction15.equals((java.lang.Object) fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str22 = fraction21.toString();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.negate();
        int int28 = fraction21.compareTo(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction15.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str31 = fraction30.toString();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction33.multiply((int) (short) 100);
        long long36 = fraction35.longValue();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction27.subtract(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction40 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction40.multiply(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction44.subtract(3);
        boolean boolean47 = fraction27.equals((java.lang.Object) fraction44);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction12.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int50 = fraction49.intValue();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction51.add((int) '#');
        boolean boolean54 = fraction49.equals((java.lang.Object) fraction51);
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str56 = fraction55.toString();
        org.apache.commons.math3.fraction.FractionField fractionField57 = fraction55.getField();
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction49.multiply(fraction55);
        double double59 = fraction58.doubleValue();
        long long60 = fraction58.longValue();
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction44.add(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction7.add(fraction61);
        boolean boolean63 = fraction3.equals((java.lang.Object) fraction7);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 / 4" + "'", str22, "1 / 4");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1 / 4" + "'", str31, "1 / 4");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 800L + "'", long36 == 800L);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1 / 2" + "'", str56, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-0.5d) + "'", double59 == (-0.5d));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.divide(97);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply(39);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction6);
        long long9 = fraction3.longValue();
        int int10 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.reciprocal();
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
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        int int11 = fraction6.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction(35);
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
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.multiply((int) (short) 100);
        long long35 = fraction34.longValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction26.subtract(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction39 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction39.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction43.subtract(3);
        boolean boolean46 = fraction26.equals((java.lang.Object) fraction43);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction13.divide(fraction43);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction43.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int50 = fraction49.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction49.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction53.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction52.multiply(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 20);
        boolean boolean61 = fraction59.equals((java.lang.Object) "10");
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction56.multiply(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction43.multiply(fraction59);
        boolean boolean64 = fraction6.equals((java.lang.Object) fraction43);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
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
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1 / 4" + "'", str30, "1 / 4");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 800L + "'", long35 == 800L);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.add(10);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) -31, (int) (short) 31);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        float float19 = fraction15.floatValue();
        int int20 = fraction15.getNumerator();
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.0f + "'", float19 == 2.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        int int6 = fraction5.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int12 = fraction11.getNumerator();
        long long13 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply((int) ' ');
        java.lang.String str20 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.add(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction23.getField();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction14.add(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.add((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction5.divide(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField32 = fraction31.getField();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction29.divide(fraction31);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 / 4" + "'", str17, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 / 4" + "'", str20, "1 / 4");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fractionField32);
        org.junit.Assert.assertNotNull(fraction33);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 16);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (-101));
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        double double3 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int5 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int9 = fraction8.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.add((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        boolean boolean19 = fraction14.equals((java.lang.Object) fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction17.subtract(fraction20);
        int int23 = fraction17.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.abs();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction13.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction13.add((-99));
        org.apache.commons.math3.fraction.Fraction fraction30 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction30.subtract((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction28.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction7.subtract(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction2.add(fraction7);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-50.0d) + "'", double3 == (-50.0d));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction6.divide(2);
        long long13 = fraction6.longValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction14.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction36 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long37 = fraction36.longValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.multiply(fraction38);
        int int40 = fraction39.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction44 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double45 = fraction44.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction39.divide(fraction44);
        java.lang.Object obj47 = null;
        boolean boolean48 = fraction44.equals(obj47);
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int50 = fraction49.intValue();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction49.multiply(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction52.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction52.divide((-1));
        int int57 = fraction56.intValue();
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction44.divide(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int60 = fraction59.intValue();
        org.apache.commons.math3.fraction.Fraction fraction61 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction59.multiply(fraction61);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction59.abs();
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction44.multiply(fraction59);
        int int65 = fraction59.intValue();
        float float66 = fraction59.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction14.subtract(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction69 = fraction67.add((int) (short) 53);
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 7500.0d + "'", double45 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + (-1.0f) + "'", float66 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction69);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) -2, (int) (short) 75);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, 51);
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        boolean boolean6 = fraction2.equals((java.lang.Object) fraction5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        int int17 = fraction16.getNumerator();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 127 + "'", int17 == 127);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1), (double) (byte) 3, 3);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        int int14 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.add(10);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.add((int) '#');
        boolean boolean22 = fraction17.equals((java.lang.Object) fraction19);
        java.lang.String str23 = fraction19.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction16.multiply(fraction19);
        int int25 = fraction11.compareTo(fraction24);
        org.apache.commons.math3.fraction.FractionField fractionField26 = fraction24.getField();
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction24.getField();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction30.abs();
        long long32 = fraction31.longValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply(31);
        java.lang.String str35 = fraction31.toString();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction31.abs();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction24.subtract(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction40 = new org.apache.commons.math3.fraction.Fraction(33.33333333333333d, (-52));
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction24.divide(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction41.divide((int) (byte) -99);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction43.add((int) (byte) -100);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction3.subtract(fraction45);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "3 / 5" + "'", str23, "3 / 5");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1 / 50" + "'", str35, "1 / 50");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.divide((int) (byte) -1);
        int int8 = fraction7.intValue();
        int int9 = fraction7.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(2.857142857142857d, (-99));
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.abs();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.subtract((int) (short) 100);
        short short4 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0.02f, (int) (short) 800);
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        java.lang.String str4 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(97);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.subtract((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.subtract(70);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction6.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide((int) (short) 2);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str21 = fraction20.toString();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.add(1);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str25 = fraction24.toString();
        double double26 = fraction24.percentageValue();
        int int27 = fraction20.compareTo(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double29 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction28.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction28.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction28.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction24.multiply(fraction35);
        int int37 = fraction36.intValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction17.add(fraction36);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 50" + "'", str4, "1 / 50");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 / 2" + "'", str21, "1 / 2");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 / 2" + "'", str25, "1 / 2");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 50.0d + "'", double26 == 50.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(fraction38);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction5);
        int int7 = fraction5.intValue();
        int int8 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) ' ');
        double double13 = fraction9.doubleValue();
        long long14 = fraction9.longValue();
        float float15 = fraction9.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction5.divide(fraction9);
        double double17 = fraction9.percentageValue();
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 4" + "'", str10, "1 / 4");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.25d + "'", double13 == 0.25d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.25f + "'", float15 == 0.25f);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 25.0d + "'", double17 == 25.0d);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.add((-59));
        long long14 = fraction8.longValue();
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
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((double) 100, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((int) (byte) -59);
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction(2600);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.add(fraction9);
        int int11 = fraction7.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 51);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.add(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        boolean boolean12 = fraction7.equals((java.lang.Object) fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction10.subtract(fraction13);
        int int16 = fraction10.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.add((int) (byte) 20);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction1.add(fraction20);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-5));
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(800, (int) (byte) 5);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply(1);
        double double10 = fraction9.doubleValue();
        int int11 = fraction9.getNumerator();
        double double12 = fraction9.percentageValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction13 = fraction2.divide(fraction9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: the fraction to divide by must not be zero: 0/1");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.divide(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.add(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.divide((int) (short) 10);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-399), 211.66666666666666d, 64);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        float float7 = fraction6.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((double) 3);
        int int10 = fraction9.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction9.divide((int) (byte) -59);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction3.add(fraction9);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-100.0f) + "'", float7 == (-100.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.3333333333333333d, 60.0d, (-52));
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.divide((int) (byte) 58);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (-100));
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply((int) (short) 60);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(97);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply((int) (short) 51);
        int int4 = fraction1.getNumerator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 100);
        long long6 = fraction5.longValue();
        int int7 = fraction5.getDenominator();
        double double8 = fraction5.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction5.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 800L + "'", long6 == 800L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 800.0d + "'", double8 == 800.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        java.lang.String str2 = fraction1.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        int int10 = fraction3.compareTo(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply((int) (byte) 1);
        int int13 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        int int16 = fraction9.compareTo(fraction14);
        long long17 = fraction14.longValue();
        int int18 = fraction1.compareTo(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.multiply((int) (short) -198);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.negate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 23);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (byte) -74, (int) (byte) 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -74 to fraction (75/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long4 = fraction3.longValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str8 = fraction7.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.subtract(fraction7);
        int int10 = fraction5.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction5.divide(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction3.add(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction5.subtract((int) (byte) 32);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(3, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.subtract((int) (byte) 32);
        boolean boolean24 = fraction0.equals((java.lang.Object) fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction0.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 4" + "'", str8, "1 / 4");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int1 = fraction0.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 65, 79);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 65 to fraction (9,223,372,036,854,775,744/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (short) -198, (double) (-4), 65);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -198 to fraction (199/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply((-6));
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((int) (short) 9, 1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.abs();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction7.add(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction4.divide(fraction7);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        double double21 = fraction19.percentageValue();
        int int22 = fraction19.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply(fraction26);
        boolean boolean28 = fraction23.equals((java.lang.Object) fraction26);
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction23.multiply(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction41 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction41.abs();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction42.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction36.subtract(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction46 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int47 = fraction46.intValue();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction46.negate();
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction46.abs();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction36.add(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int52 = fraction51.intValue();
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str54 = fraction53.toString();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction51.subtract(fraction53);
        int int56 = fraction51.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int58 = fraction57.intValue();
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction57.negate();
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction51.divide(fraction57);
        float float61 = fraction57.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction62 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField63 = fraction62.getField();
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction62.divide((int) '4');
        double double66 = fraction65.doubleValue();
        int int67 = fraction57.compareTo(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction49.divide(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction69 = fraction34.divide(fraction68);
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction68.negate();
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction19.add(fraction68);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3750.0d + "'", double21 == 3750.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 75 + "'", int22 == 75);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1 / 4" + "'", str54, "1 / 4");
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-1.0f) + "'", float61 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fractionField63);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.014423076923076924d + "'", double66 == 0.014423076923076924d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction14.multiply(136);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction28.abs();
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
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.abs();
        float float5 = fraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(0);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add(41);
        byte byte10 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        int int21 = fraction19.getNumerator();
        java.lang.Object obj22 = null;
        boolean boolean23 = fraction19.equals(obj22);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-16) + "'", int21 == (-16));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        int int6 = fraction5.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int12 = fraction11.getNumerator();
        long long13 = fraction11.longValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.add(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply((int) ' ');
        java.lang.String str20 = fraction16.toString();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.add(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction23.getField();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction14.add(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.add((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction5.divide(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.divide((-91));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 / 4" + "'", str17, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 / 4" + "'", str20, "1 / 4");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(101, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 20);
        int int7 = fraction4.compareTo(fraction6);
        int int8 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long2 = fraction1.longValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        double double5 = fraction1.percentageValue();
        long long6 = fraction1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10000.0d + "'", double5 == 10000.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction3.divide(4950);
        org.apache.commons.math3.fraction.Fraction fraction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = fraction3.compareTo(fraction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction4.add(fraction17);
        float float19 = fraction4.floatValue();
        int int20 = fraction4.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction4.subtract(0);
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        java.lang.String str15 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction(0.5d);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.divide(13);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction4.divide(fraction19);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        java.lang.String str4 = fraction0.toString();
        java.lang.String str5 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.multiply((int) (byte) 37);
        long long8 = fraction7.longValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        boolean boolean14 = fraction9.equals((java.lang.Object) fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.negate();
        int int22 = fraction15.compareTo(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction9.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str25 = fraction24.toString();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.multiply((int) (short) 100);
        long long30 = fraction29.longValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction31.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction7.subtract(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction33.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 / 4" + "'", str4, "1 / 4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 4" + "'", str5, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 / 4" + "'", str25, "1 / 4");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 800L + "'", long30 == 800L);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 1, 35);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        int int6 = fraction5.getNumerator();
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
        long long44 = fraction9.longValue();
        double double45 = fraction9.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction5.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction46.add((-5050));
        org.apache.commons.math3.fraction.Fraction fraction52 = new org.apache.commons.math3.fraction.Fraction((double) (-1), (double) (byte) 3, 3);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction52.subtract((int) (byte) 100);
        int int55 = fraction54.getDenominator();
        int int56 = fraction54.getNumerator();
        int int57 = fraction54.intValue();
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction46.multiply(fraction54);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-349) + "'", int6 == (-349));
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-101) + "'", int56 == (-101));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-101) + "'", int57 == (-101));
        org.junit.Assert.assertNotNull(fraction58);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction21.multiply(13);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction21.multiply((int) (short) -5);
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
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction8.multiply((-10));
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double29 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str31 = fraction30.toString();
        org.apache.commons.math3.fraction.FractionField fractionField32 = fraction30.getField();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction28.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction33.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction35.subtract((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction39 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.add(140);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction39.add(75);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction39.abs();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction37.divide(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction47 = new org.apache.commons.math3.fraction.Fraction((-16));
        int int48 = fraction39.compareTo(fraction47);
        java.lang.String str49 = fraction39.toString();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction8.multiply(fraction39);
        int int51 = fraction50.getDenominator();
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1 / 2" + "'", str31, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "52" + "'", str49, "52");
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction5.getField();
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
        org.junit.Assert.assertNotNull(fractionField19);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add(10);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (short) 100);
        long long6 = fraction5.longValue();
        int int7 = fraction5.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.negate();
        double double9 = fraction5.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 800L + "'", long6 == 800L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 800.0d + "'", double9 == 800.0d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
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
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction6.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction6.divide(57);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
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
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction22.getField();
        org.apache.commons.math3.fraction.FractionField fractionField25 = fraction22.getField();
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
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fractionField25);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) -100, (int) (byte) 20);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.add((int) '#');
        boolean boolean13 = fraction8.equals((java.lang.Object) fraction10);
        long long14 = fraction10.longValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double19 = fraction18.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction10.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction18.add((int) (byte) -1);
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
        float float34 = fraction30.floatValue();
        long long35 = fraction30.longValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction30.negate();
        java.lang.String str37 = fraction30.toString();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction18.multiply(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction7.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction42 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction42.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction46 = new org.apache.commons.math3.fraction.Fraction(100, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int48 = fraction47.intValue();
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction47.multiply(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction50.negate();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction50.negate();
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int54 = fraction53.intValue();
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction53.multiply(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction56.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction58.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction50.multiply(fraction60);
        org.apache.commons.math3.fraction.Fraction fraction62 = org.apache.commons.math3.fraction.Fraction.TWO;
        boolean boolean63 = fraction60.equals((java.lang.Object) fraction62);
        int int64 = fraction62.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction62.multiply(10);
        org.apache.commons.math3.fraction.Fraction fraction67 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str68 = fraction67.toString();
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction67.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction70.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction73 = fraction66.divide(fraction72);
        double double74 = fraction72.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction46.multiply(fraction72);
        org.apache.commons.math3.fraction.Fraction fraction76 = fraction42.subtract(fraction46);
        long long77 = fraction42.longValue();
        org.apache.commons.math3.fraction.Fraction fraction78 = fraction7.multiply(fraction42);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7500.0d + "'", double19 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
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
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-1" + "'", str37, "-1");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1 / 4" + "'", str68, "1 / 4");
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 80000.0d + "'", double74 == 80000.0d);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
        org.junit.Assert.assertNotNull(fraction78);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(11);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int1 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        java.lang.String str5 = fraction3.toString();
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
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.divide((-3));
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction3.divide(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.subtract((int) (byte) -74);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.subtract(97);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1 / 2" + "'", str5, "-1 / 2");
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
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double3 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction2.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction2.negate();
        int int11 = fraction1.compareTo(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction1.negate();
        int int13 = fraction12.getDenominator();
        int int14 = fraction12.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long18 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = new org.apache.commons.math3.fraction.Fraction(50.0d);
        boolean boolean23 = fraction17.equals((java.lang.Object) fraction22);
        int int24 = fraction7.compareTo(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction26 = new org.apache.commons.math3.fraction.Fraction(100);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.negate();
        int int28 = fraction26.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction17.subtract(fraction26);
        int int30 = fraction26.getNumerator();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(0);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction((double) (short) -100);
        int int15 = fraction12.compareTo(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction12.subtract((int) (short) 68);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int10 = fraction9.getNumerator();
        long long11 = fraction9.longValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply((int) ' ');
        java.lang.String str18 = fraction14.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction12.add(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction12.abs();
        java.lang.String str21 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction2.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.multiply(0);
        double double25 = fraction24.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 / 4" + "'", str15, "1 / 4");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 / 4" + "'", str18, "1 / 4");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-2 / 3" + "'", str21, "-2 / 3");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double4 = fraction3.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.negate();
        int int12 = fraction5.compareTo(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.add((int) '#');
        boolean boolean19 = fraction14.equals((java.lang.Object) fraction16);
        long long20 = fraction16.longValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double25 = fraction24.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction16.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.negate();
        int int28 = fraction13.compareTo(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction3.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.divide((int) (byte) 116);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction29.add((int) (short) 13);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7500.0d + "'", double4 == 7500.0d);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7500.0d + "'", double25 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (-75));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (short) -1, 7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -1 to fraction (-9,223,372,036,854,775,806/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        double double12 = fraction5.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction16.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.subtract(200);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction15.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply((int) (short) -802);
        boolean boolean24 = fraction5.equals((java.lang.Object) fraction20);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.multiply((int) (short) -802);
        int int27 = fraction26.getNumerator();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 800.0d + "'", double12 == 800.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 132330 + "'", int27 == 132330);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double4 = fraction3.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction3.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction2.subtract(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction2.abs();
        java.lang.String str14 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97 / 100" + "'", str14, "97 / 100");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.add((-9));
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(203);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract(53);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 0.021428572f);
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.add(1);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str7 = fraction6.toString();
        double double8 = fraction6.percentageValue();
        int int9 = fraction2.compareTo(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double11 = fraction10.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction10.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction10.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction6.multiply(fraction17);
        java.lang.String str19 = fraction17.toString();
        int int20 = fraction1.compareTo(fraction17);
        int int21 = fraction17.getDenominator();
        int int22 = fraction17.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 / 2" + "'", str3, "1 / 2");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 2" + "'", str7, "1 / 2");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2" + "'", str19, "2");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(301, 97);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int21 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int25 = fraction24.getNumerator();
        long long26 = fraction24.longValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction20.add(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction27.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((-0.5d), 0.0d, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.multiply((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction34.multiply((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.multiply((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction28.divide(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction5.divide(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction40.subtract((-44));
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str44 = fraction43.toString();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction43.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction47.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction43.add(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction47.add(100);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction40.subtract(fraction52);
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1 / 4" + "'", str44, "1 / 4");
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.reciprocal();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction4.add(60);
        double double18 = fraction17.percentageValue();
        long long19 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.divide((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction27.negate();
        int int29 = fraction22.compareTo(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction28.abs();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction33.abs();
        long long35 = fraction34.longValue();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.multiply(31);
        java.lang.String str38 = fraction34.toString();
        double double39 = fraction34.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction34.abs();
        int int41 = fraction30.compareTo(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction34.add((int) (byte) 37);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction34.add(125);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction17.add(fraction34);
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6100.0d + "'", double18 == 6100.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 61L + "'", long19 == 61L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 / 4" + "'", str23, "1 / 4");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1 / 50" + "'", str38, "1 / 50");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.02d + "'", double39 == 0.02d);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction0.subtract(fraction6);
        int int10 = fraction6.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-2.0d));
        long long2 = fraction1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(125, (int) (short) -35);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply(fraction20);
        boolean boolean22 = fraction17.equals((java.lang.Object) fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str24 = fraction23.toString();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction25.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction28.negate();
        int int30 = fraction23.compareTo(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction17.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.divide((-3));
        org.apache.commons.math3.fraction.Fraction fraction37 = new org.apache.commons.math3.fraction.Fraction((double) 101.0f, (double) 'a', (int) (short) 35);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction31.divide(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction38.abs();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction16.divide(fraction39);
        java.lang.String str41 = fraction39.toString();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1 / 4" + "'", str24, "1 / 4");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1 / 202" + "'", str41, "1 / 202");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-52), (int) (byte) -1);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(60, (-1));
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction(35, 10);
        int int8 = fraction4.compareTo(fraction7);
        int int9 = fraction3.compareTo(fraction7);
        double double10 = fraction3.percentageValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6000.0d + "'", double10 == 6000.0d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 9, (double) 1, (int) (short) 21);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction((int) (short) 3, 60);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction14.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction22 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) -2);
        org.apache.commons.math3.fraction.FractionField fractionField23 = fraction22.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction14.subtract(fraction22);
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
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        java.lang.String str29 = fraction27.toString();
        org.apache.commons.math3.fraction.FractionField fractionField30 = fraction27.getField();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double32 = fraction31.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction31.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction31.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str40 = fraction39.toString();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction39.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction42.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int46 = fraction45.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction42.subtract(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str51 = fraction50.toString();
        org.apache.commons.math3.fraction.Fraction fraction52 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int53 = fraction52.intValue();
        org.apache.commons.math3.fraction.Fraction fraction54 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction52.multiply(fraction54);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction55.negate();
        int int57 = fraction50.compareTo(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction56.multiply((int) (byte) 1);
        int int60 = fraction56.intValue();
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction42.subtract(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction38.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction27.subtract(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction63.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction63.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction63.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction67.negate();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-4 / 3" + "'", str29, "-4 / 3");
        org.junit.Assert.assertNotNull(fractionField30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1 / 4" + "'", str40, "1 / 4");
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1 / 4" + "'", str51, "1 / 4");
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.add((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction11.subtract(fraction14);
        boolean boolean19 = fraction3.equals((java.lang.Object) fraction11);
        int int20 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction3.multiply((int) (short) 10);
        double double23 = fraction22.doubleValue();
        int int24 = fraction22.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction(133.33333333333334d, (int) (byte) -5);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.multiply(2600);
        int int30 = fraction22.compareTo(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.subtract((int) (short) 80);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.divide(76);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 80.0d + "'", double23 == 80.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.add((int) (byte) 37);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction9.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) 'a', 115);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 0.5f, (double) 35L, 200);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((-1), (int) 'a');
        double double16 = fraction15.percentageValue();
        double double17 = fraction15.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction9.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction3.subtract(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction3.subtract((int) (byte) 74);
        byte byte22 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 2" + "'", str11, "1 / 2");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0309278350515463d) + "'", double16 == (-1.0309278350515463d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0309278350515463d) + "'", double17 == (-1.0309278350515463d));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 21);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(140);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction9.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int20 = fraction19.getNumerator();
        long long21 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction15.add(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction9.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction19.multiply((-3));
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction7.divide(fraction26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.reciprocal();
        double double6 = fraction5.percentageValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0, 3);
        long long3 = fraction2.longValue();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) -198, 20);
        int int3 = fraction2.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.reciprocal();
        java.lang.Class<?> wildcardClass5 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 9);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 10, (int) (short) 1);
        double double3 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.add((int) (byte) 3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double7 = fraction6.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.subtract(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction14.add(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction6.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction27.subtract(800);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction2.add(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction33.add((int) '#');
        int int36 = fraction33.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str40 = fraction39.toString();
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction37.subtract(fraction39);
        long long42 = fraction41.longValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction41.negate();
        int int44 = fraction41.getNumerator();
        double double45 = fraction41.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction33.add(fraction41);
        int int47 = fraction2.compareTo(fraction46);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 / 4" + "'", str13, "1 / 4");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1 / 4" + "'", str40, "1 / 4");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-2600.0d));
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction8.multiply((-10));
        long long28 = fraction27.longValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction27.multiply(125);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5L + "'", long28 == 5L);
        org.junit.Assert.assertNotNull(fraction30);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) ' ');
        double double4 = fraction0.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.multiply((int) '#');
        java.lang.String str8 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double10 = fraction9.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction9.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int20 = fraction19.getNumerator();
        long long21 = fraction19.longValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction15.add(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction9.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction5.add(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.multiply((int) ' ');
        long long27 = fraction23.longValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction0.subtract(fraction23);
        int int29 = fraction28.intValue();
        int int30 = fraction28.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25d + "'", double4 == 0.25d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double13 = fraction12.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(2);
        int int16 = fraction1.compareTo(fraction15);
        boolean boolean18 = fraction1.equals((java.lang.Object) (-6));
        int int19 = fraction1.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int21 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str27 = fraction26.toString();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.add(10);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction31.abs();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction31.divide((int) (byte) 7);
        int int37 = fraction23.compareTo(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction40 = new org.apache.commons.math3.fraction.Fraction(12.5d, 3);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction40.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction23.add(fraction41);
        boolean boolean43 = fraction1.equals((java.lang.Object) fraction41);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1 / 4" + "'", str27, "1 / 4");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int2 = fraction1.intValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(fraction3);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract(3);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double9 = fraction8.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(2);
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
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction16.add(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction8.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction29.subtract(800);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction33.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int36 = fraction35.intValue();
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction35.multiply(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction35.abs();
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int41 = fraction40.intValue();
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction40.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction45 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long46 = fraction45.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField47 = fraction45.getField();
        long long48 = fraction45.longValue();
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction42.divide(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction39.add(fraction42);
        double double51 = fraction42.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction34.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction0.divide(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction34.divide((int) (short) -31);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(fraction11);
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
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertNotNull(fractionField47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.5d + "'", double51 == 0.5d);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction55);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.3333333333333333d, 35);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction2.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.subtract(100);
        int int9 = fraction5.getDenominator();
        double double10 = fraction5.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.subtract(34);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double27 = fraction26.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply(2);
        java.lang.String str30 = fraction29.toString();
        int int31 = fraction29.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction18.add(fraction29);
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
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2" + "'", str30, "2");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(fraction32);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.multiply((int) '#');
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction4.getField();
        boolean boolean8 = fraction3.equals((java.lang.Object) fraction4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add((int) (byte) 74);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double13 = fraction12.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction12.add((int) (short) 100);
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
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction12.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double30 = fraction29.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply(2);
        int int33 = fraction29.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction28.multiply(fraction29);
        double double35 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction28.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.add(357);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction11.divide(fraction39);
        float float41 = fraction11.floatValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
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
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-25.0d) + "'", double35 == (-25.0d));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 75.0f + "'", float41 == 75.0f);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(208, (int) (short) -31);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply((int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.reciprocal();
        float float6 = fraction2.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.subtract((int) (short) -16);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.5f) + "'", float6 == (-0.5f));
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(51);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.multiply(5);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long18 = fraction17.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction17.getField();
        long long20 = fraction17.longValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction14.divide(fraction17);
        int int22 = fraction21.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str24 = fraction23.toString();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction29 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction23.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction35 = new org.apache.commons.math3.fraction.Fraction(75.0d, 10.0d, (int) ' ');
        double double36 = fraction35.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction31.subtract(fraction35);
        int int38 = fraction37.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction41 = new org.apache.commons.math3.fraction.Fraction((double) 0.6f, (int) (short) 10);
        boolean boolean42 = fraction37.equals((java.lang.Object) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction11.add(fraction37);
        int int44 = fraction43.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction1.multiply(fraction43);
        long long46 = fraction43.longValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 / 4" + "'", str7, "1 / 4");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1 / 4" + "'", str24, "1 / 4");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 7500.0d + "'", double36 == 7500.0d);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-195137) + "'", int38 == (-195137));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2600 + "'", int44 == 2600);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-35L) + "'", long46 == (-35L));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        double double23 = fraction16.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction16.negate();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.reciprocal();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-25.0d) + "'", double23 == (-25.0d));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.multiply((int) (byte) 8);
        double double22 = fraction21.doubleValue();
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
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 789.3333333333334d + "'", double22 == 789.3333333333334d);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-99), (int) (byte) -59);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 32, (double) 6, (int) (short) -198);
        double double33 = fraction32.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction34.negate();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction32.subtract(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction28.add(fraction34);
        float float38 = fraction37.floatValue();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 3200.0d + "'", double33 == 3200.0d);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-3.9454546f) + "'", float38 == (-3.9454546f));
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(76, (int) (byte) 5);
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.junit.Assert.assertNotNull(fractionField3);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 0.004901961f, 2.857142857142857d, (int) (short) 5);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-1600.0d));
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) (-3), 800.0d, (int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction10.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.add(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction7.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.divide(fraction14);
        long long19 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.negate();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.math3.fraction.FractionField fractionField22 = fraction18.getField();
        boolean boolean23 = fraction1.equals((java.lang.Object) fractionField22);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 / 2" + "'", str15, "1 / 2");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-6L) + "'", long19 == (-6L));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-6" + "'", str21, "-6");
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction14.multiply(136);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int30 = fraction29.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction32.divide((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction32.divide((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int41 = fraction40.intValue();
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction40.multiply(fraction42);
        boolean boolean44 = fraction39.equals((java.lang.Object) fraction42);
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField46 = fraction45.getField();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction42.subtract(fraction45);
        int int48 = fraction42.getDenominator();
        boolean boolean49 = fraction32.equals((java.lang.Object) fraction42);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction14.divide(fraction42);
        java.lang.String str51 = fraction14.toString();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fractionField46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1 / 2" + "'", str51, "1 / 2");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-0.5d));
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply(fraction6);
        java.lang.String str8 = fraction6.toString();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction1.multiply(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int12 = fraction11.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction1.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction14.subtract(13);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.abs();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 / 3" + "'", str8, "1 / 3");
        org.junit.Assert.assertNotNull(fraction9);
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
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.add(100);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (byte) -1);
        float float2 = fraction1.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction1.getField();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        org.junit.Assert.assertNotNull(fractionField3);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double1 = fraction0.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction12.multiply((int) (byte) -1);
        long long15 = fraction14.longValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(31);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.negate();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str25 = fraction24.toString();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.add(fraction24);
        int int27 = fraction24.getDenominator();
        org.apache.commons.math3.fraction.FractionField fractionField28 = fraction24.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction14.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction8.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction8.subtract((int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = fraction32.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 / 2" + "'", str25, "1 / 2");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) -2);
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        float float7 = fraction6.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = new org.apache.commons.math3.fraction.Fraction((double) 3);
        int int10 = fraction9.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction6.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.negate();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction15.multiply(fraction25);
        int int27 = fraction15.intValue();
        java.lang.String str28 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction9.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction2.multiply(fraction29);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-100.0f) + "'", float7 == (-100.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1 / 2" + "'", str28, "-1 / 2");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        boolean boolean16 = fraction13.equals((java.lang.Object) fraction15);
        int int17 = fraction15.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(10);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str21 = fraction20.toString();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction19.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction19.multiply(100);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 / 4" + "'", str21, "1 / 4");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-10), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.subtract(200);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.negate();
        java.lang.String str10 = fraction9.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "165" + "'", str10, "165");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction4.add(100);
        long long10 = fraction4.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 / 4" + "'", str1, "1 / 4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.subtract((int) (byte) -5);
        java.lang.String str40 = fraction39.toString();
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
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "23" + "'", str40, "23");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-1L), (double) ' ', (int) '#');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.negate();
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
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction6.divide(fraction20);
        org.apache.commons.math3.fraction.FractionField fractionField22 = fraction20.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.negate();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
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
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 900);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction6.abs();
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
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(25, (int) (byte) -29);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        java.lang.String str16 = fraction7.toString();
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction7.getField();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-2 / 3" + "'", str16, "-2 / 3");
        org.junit.Assert.assertNotNull(fractionField17);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
        float float27 = fraction21.floatValue();
        java.lang.Class<?> wildcardClass28 = fraction21.getClass();
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
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.6f) + "'", float27 == (-0.6f));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(6000.0d);
        int int2 = fraction1.intValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6000 + "'", int2 == 6000);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) '4', (int) (short) 24);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.subtract(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction7.subtract(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction11.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.divide((int) (short) -802);
        long long23 = fraction20.longValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction2.multiply(fraction20);
        int int25 = fraction20.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 / 4" + "'", str6, "1 / 4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        double double18 = fraction15.percentageValue();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 400.0d + "'", double18 == 400.0d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(133.33333333333334d, (int) (byte) -5);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.multiply(2600);
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(35, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction2.divide(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(fraction12);
        boolean boolean14 = fraction9.equals((java.lang.Object) fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction20.negate();
        int int22 = fraction15.compareTo(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction9.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction9.multiply((int) (byte) 20);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double28 = fraction27.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.math3.fraction.FractionField fractionField31 = fraction29.getField();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction27.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction32.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str36 = fraction35.toString();
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction37.multiply(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction40.negate();
        int int42 = fraction35.compareTo(fraction41);
        float float43 = fraction35.floatValue();
        org.apache.commons.math3.fraction.FractionField fractionField44 = fraction35.getField();
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction32.subtract(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction35.reciprocal();
        org.apache.commons.math3.fraction.FractionField fractionField47 = fraction35.getField();
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction48.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction35.subtract(fraction50);
        int int52 = fraction26.compareTo(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str54 = fraction53.toString();
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction53.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction59 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 3, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction53.multiply(fraction59);
        int int61 = fraction53.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction26.subtract(fraction53);
        int int63 = fraction8.compareTo(fraction62);
        org.apache.commons.math3.fraction.Fraction fraction65 = new org.apache.commons.math3.fraction.Fraction((double) 1);
        org.apache.commons.math3.fraction.Fraction fraction66 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction67 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction66.multiply(fraction67);
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction68.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction68.negate();
        org.apache.commons.math3.fraction.Fraction fraction72 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str73 = fraction72.toString();
        org.apache.commons.math3.fraction.Fraction fraction74 = fraction71.add(fraction72);
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction65.multiply(fraction72);
        org.apache.commons.math3.fraction.Fraction fraction76 = fraction75.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction77 = fraction8.divide(fraction76);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1 / 2" + "'", str30, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1 / 4" + "'", str36, "1 / 4");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.25f + "'", float43 == 0.25f);
        org.junit.Assert.assertNotNull(fractionField44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fractionField47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1 / 4" + "'", str54, "1 / 4");
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1 / 2" + "'", str73, "1 / 2");
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.subtract(100);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.multiply(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 20);
        boolean boolean12 = fraction10.equals((java.lang.Object) "10");
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction7.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double15 = fraction14.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction14.multiply(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.divide(4);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.subtract((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction25 = new org.apache.commons.math3.fraction.Fraction((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.add(140);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.add(75);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction25.abs();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction23.divide(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction33 = new org.apache.commons.math3.fraction.Fraction((-16));
        int int34 = fraction25.compareTo(fraction33);
        java.lang.String str35 = fraction25.toString();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int37 = fraction36.intValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.multiply(fraction38);
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int41 = fraction40.getNumerator();
        long long42 = fraction40.longValue();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction36.add(fraction40);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction43.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str46 = fraction45.toString();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.multiply((int) ' ');
        java.lang.String str49 = fraction45.toString();
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction43.add(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction52 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long53 = fraction52.longValue();
        org.apache.commons.math3.fraction.Fraction fraction54 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction52.multiply(fraction54);
        org.apache.commons.math3.fraction.Fraction fraction57 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long58 = fraction57.longValue();
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction57.multiply(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction52.add(fraction60);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction50.subtract(fraction61);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction25.add(fraction50);
        boolean boolean64 = fraction7.equals((java.lang.Object) fraction25);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 / 2" + "'", str17, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "52" + "'", str35, "52");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1 / 4" + "'", str46, "1 / 4");
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1 / 4" + "'", str49, "1 / 4");
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 100L + "'", long58 == 100L);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction13.reciprocal();
        java.lang.String str19 = fraction13.toString();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-5.0f) + "'", float8 == (-5.0f));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 33.33333333333333d + "'", double16 == 33.33333333333333d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1 / 3" + "'", str19, "1 / 3");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1010.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1,010 to fraction (-1,009/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 15, 14);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) -1, (-1));
        double double3 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(5, 35);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction6.divide(208);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply((int) (byte) 74);
        boolean boolean11 = fraction2.equals((java.lang.Object) (byte) 74);
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long14 = fraction13.longValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long19 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction13.add(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction21.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int27 = fraction26.intValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply(fraction28);
        boolean boolean30 = fraction25.equals((java.lang.Object) fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str32 = fraction31.toString();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int34 = fraction33.intValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction36.negate();
        int int38 = fraction31.compareTo(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction25.subtract(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str41 = fraction40.toString();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction40.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction43.multiply((int) (short) 100);
        long long46 = fraction45.longValue();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction37.subtract(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction47.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction23.add(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction23.negate();
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction50.abs();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction2.add(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        int int54 = fraction53.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction53.negate();
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction55.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction58 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int59 = fraction58.intValue();
        org.apache.commons.math3.fraction.Fraction fraction60 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction58.multiply(fraction60);
        org.apache.commons.math3.fraction.Fraction fraction62 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int63 = fraction62.getNumerator();
        long long64 = fraction62.longValue();
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction58.add(fraction62);
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction65.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction67 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str68 = fraction67.toString();
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction67.multiply((int) ' ');
        java.lang.String str71 = fraction67.toString();
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction65.add(fraction67);
        org.apache.commons.math3.fraction.Fraction fraction73 = fraction65.abs();
        java.lang.String str74 = fraction65.toString();
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction55.multiply(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction77 = fraction65.multiply(3);
        org.apache.commons.math3.fraction.Fraction fraction78 = fraction51.subtract(fraction77);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1 / 4" + "'", str32, "1 / 4");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1 / 4" + "'", str41, "1 / 4");
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 800L + "'", long46 == 800L);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1 / 4" + "'", str68, "1 / 4");
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1 / 4" + "'", str71, "1 / 4");
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "-2 / 3" + "'", str74, "-2 / 3");
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 100, 100);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.divide((int) (short) 75);
        long long5 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        int int13 = fraction9.getDenominator();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 3L);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((int) (short) 20, (int) (short) 20);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE;
        double double8 = fraction7.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply(2);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction7.add((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.subtract(fraction15);
        int int18 = fraction13.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int20 = fraction19.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.negate();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction13.divide(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction7.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction6.divide(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply((int) (short) 10033);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 / 4" + "'", str16, "1 / 4");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction9.add((int) (short) 192);
        int int32 = fraction9.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction9.add(80);
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
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.reciprocal();
        java.lang.Class<?> wildcardClass4 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 100, (int) (byte) -1);
        float float3 = fraction2.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = new org.apache.commons.math3.fraction.Fraction((double) 3);
        int int6 = fraction5.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.add(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.divide((int) (byte) -59);
        int int10 = fraction5.getDenominator();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3 == (-100.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, (int) '4');
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
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO;
        boolean boolean19 = fraction16.equals((java.lang.Object) fraction18);
        int int20 = fraction18.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction18.multiply(10);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str24 = fraction23.toString();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.multiply((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction22.divide(fraction28);
        double double30 = fraction28.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction2.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction33 = new org.apache.commons.math3.fraction.Fraction((-266.66666666666663d));
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction2.multiply(fraction33);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1 / 4" + "'", str24, "1 / 4");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 80000.0d + "'", double30 == 80000.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add((int) (byte) 116);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction22.abs();
        long long24 = fraction23.longValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction23.abs();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int27 = fraction26.intValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction26.abs();
        float float31 = fraction26.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction26.add(0);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction25.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction17.subtract(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction34.add((int) (short) 52);
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
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int34 = fraction33.intValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction35.add((int) '#');
        boolean boolean38 = fraction33.equals((java.lang.Object) fraction35);
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        java.lang.String str40 = fraction39.toString();
        org.apache.commons.math3.fraction.FractionField fractionField41 = fraction39.getField();
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction33.multiply(fraction39);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction39.multiply((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction46 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction45.multiply(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction47.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction47.negate();
        int int51 = fraction44.compareTo(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction55 = new org.apache.commons.math3.fraction.Fraction(10.0d, 50.0d, (int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction56 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction56.multiply(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction58.subtract((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction58.negate();
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction55.subtract(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction58.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction50.add(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction32.multiply(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction68 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction69 = fraction68.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction70 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction70.multiply((int) '#');
        org.apache.commons.math3.fraction.FractionField fractionField73 = fraction70.getField();
        boolean boolean74 = fraction69.equals((java.lang.Object) fraction70);
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction69.abs();
        org.apache.commons.math3.fraction.Fraction fraction77 = fraction75.add((int) (byte) 74);
        org.apache.commons.math3.fraction.Fraction fraction80 = new org.apache.commons.math3.fraction.Fraction((double) 0.02f, (int) (short) 800);
        org.apache.commons.math3.fraction.Fraction fraction82 = fraction80.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction83 = fraction77.divide(fraction82);
        org.apache.commons.math3.fraction.Fraction fraction84 = fraction65.divide(fraction83);
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
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1 / 2" + "'", str40, "1 / 2");
        org.junit.Assert.assertNotNull(fractionField41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fractionField73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.divide(2);
        java.lang.String str6 = fraction3.toString();
        int int7 = fraction3.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3 / 208" + "'", str6, "3 / 208");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, (int) (byte) 8);
        org.apache.commons.math3.fraction.Fraction fraction44 = new org.apache.commons.math3.fraction.Fraction((-20.0d), (double) 101.0f, 0);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction40.subtract(fraction44);
        boolean boolean46 = fraction37.equals((java.lang.Object) fraction45);
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
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) -5, 65);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.reciprocal();
        short short17 = fraction12.shortValue();
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
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 8 + "'", short17 == (short) 8);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        double double18 = fraction0.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int20 = fraction19.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction19.multiply(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int24 = fraction23.getNumerator();
        long long25 = fraction23.longValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction19.add(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction23.multiply((int) (short) 100);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction0.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction23.abs();
        org.apache.commons.math3.fraction.FractionField fractionField31 = fraction30.getField();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fractionField31);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 3, (-195137));
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.537381429457253E-5d) + "'", double4 == (-1.537381429457253E-5d));
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(20.0d);
        long long2 = fraction1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.14285714285714285d, 3);
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((-0.5d));
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction5.multiply(fraction9);
        java.lang.String str11 = fraction9.toString();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction4.multiply(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction(75);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.divide(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction2.divide(fraction16);
        long long18 = fraction17.longValue();
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 / 3" + "'", str11, "1 / 3");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int25 = fraction24.intValue();
        int int26 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.add(10);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int30 = fraction29.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction31.add((int) '#');
        boolean boolean34 = fraction29.equals((java.lang.Object) fraction31);
        java.lang.String str35 = fraction31.toString();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction28.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction22.add(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int41 = fraction40.intValue();
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction40.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction40.abs();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int46 = fraction45.intValue();
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.multiply(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction50 = new org.apache.commons.math3.fraction.Fraction((double) (short) 100);
        long long51 = fraction50.longValue();
        org.apache.commons.math3.fraction.FractionField fractionField52 = fraction50.getField();
        long long53 = fraction50.longValue();
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction47.divide(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction44.add(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction36.multiply(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction36.subtract((int) (short) -165);
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
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "3 / 5" + "'", str35, "3 / 5");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(fractionField52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction58);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction2.divide((-99));
        double double16 = fraction2.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int22 = fraction21.getNumerator();
        long long23 = fraction21.longValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.add(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        java.lang.String str27 = fraction26.toString();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply((int) ' ');
        java.lang.String str30 = fraction26.toString();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction24.add(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction24.abs();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.FractionField fractionField34 = fraction33.getField();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction24.add(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction33.reciprocal();
        double double39 = fraction33.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction41 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        int int42 = fraction41.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction41.multiply((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction40.multiply(fraction44);
        java.lang.String str46 = fraction44.toString();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction44.negate();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction33.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction2.subtract(fraction33);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.857142857142857d + "'", double16 == 2.857142857142857d);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1 / 4" + "'", str27, "1 / 4");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1 / 4" + "'", str30, "1 / 4");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fractionField34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.75d + "'", double39 == 0.75d);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1 / 3" + "'", str46, "1 / 3");
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
    }
}

