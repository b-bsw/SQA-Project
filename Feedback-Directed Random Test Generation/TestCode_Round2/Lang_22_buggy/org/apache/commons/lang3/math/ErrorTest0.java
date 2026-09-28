package org.apache.commons.lang3.math;

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
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction8", (fraction7.compareTo(fraction8) == 0) == fraction7.equals(fraction8));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.divideBy(fraction6);
        java.lang.String str8 = fraction7.toString();
        long long9 = fraction7.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.subtract(fraction7);
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction15.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction20.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction14.divideBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction10.multiplyBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction2.subtract(fraction26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction3", (fraction0.compareTo(fraction3) == 0) == fraction0.equals(fraction3));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        java.lang.String str3 = fraction1.toString();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction5.divideBy(fraction7);
        java.lang.String str9 = fraction8.toString();
        long long10 = fraction8.longValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.subtract(fraction8);
        int int12 = fraction1.compareTo(fraction11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction1 and fraction4", (fraction1.compareTo(fraction4) == 0) == fraction1.equals(fraction4));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -1, 3);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.divideBy(fraction5);
        java.lang.String str7 = fraction6.toString();
        int int8 = fraction6.getProperNumerator();
        float float9 = fraction6.floatValue();
        java.lang.String str10 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction13.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.divideBy(fraction20);
        java.lang.String str22 = fraction21.toString();
        long long23 = fraction21.longValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction17.subtract(fraction21);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction16.add(fraction17);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction6.multiplyBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction2.add(fraction25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction24", (fraction2.compareTo(fraction24) == 0) == fraction2.equals(fraction24));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.reduce();
        float float9 = fraction7.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction8", (fraction7.compareTo(fraction8) == 0) == fraction7.equals(fraction8));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.reduce();
        int int9 = fraction8.getDenominator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction8", (fraction7.compareTo(fraction8) == 0) == fraction7.equals(fraction8));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.reduce();
        int int9 = fraction7.getProperWhole();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction8", (fraction7.compareTo(fraction8) == 0) == fraction7.equals(fraction8));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.reduce();
        short short9 = fraction7.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction8", (fraction7.compareTo(fraction8) == 0) == fraction7.equals(fraction8));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.divideBy(fraction2);
        java.lang.String str4 = fraction3.toString();
        int int5 = fraction3.getProperNumerator();
        float float6 = fraction3.floatValue();
        java.lang.String str7 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction15.divideBy(fraction17);
        java.lang.String str19 = fraction18.toString();
        long long20 = fraction18.longValue();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction14.subtract(fraction18);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction13.add(fraction14);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction3.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.multiplyBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction32 = fraction25.multiplyBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction29.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int36 = fraction35.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction35.divideBy(fraction37);
        java.lang.String str39 = fraction38.toString();
        int int40 = fraction38.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction38.reduce();
        int int42 = fraction41.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction34.multiplyBy(fraction41);
        double double44 = fraction41.doubleValue();
        int int45 = fraction3.compareTo(fraction41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction14 and fraction24", (fraction14.compareTo(fraction24) == 0) == fraction14.equals(fraction24));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.subtract(fraction20);
        int int22 = fraction0.compareTo(fraction21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction18", (fraction0.compareTo(fraction18) == 0) == fraction0.equals(fraction18));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.reduce();
        java.lang.String str9 = fraction7.toProperString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction8", (fraction7.compareTo(fraction8) == 0) == fraction7.equals(fraction8));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        java.lang.String str11 = fraction10.toString();
        long long12 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction6);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction15.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction20.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction29 = fraction26.divideBy(fraction28);
        java.lang.String str30 = fraction29.toString();
        long long31 = fraction29.longValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction25.subtract(fraction29);
        int int33 = fraction32.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.divideBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction24.divideBy(fraction35);
        int int37 = fraction6.compareTo(fraction36);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction36.invert();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.multiplyBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction44.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction47 = fraction40.multiplyBy(fraction44);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction44.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int51 = fraction50.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction53 = fraction50.divideBy(fraction52);
        java.lang.String str54 = fraction53.toString();
        int int55 = fraction53.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction53.reduce();
        int int57 = fraction56.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction49.multiplyBy(fraction56);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction60 = fraction58.divideBy(fraction59);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction58.pow(0);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction38.add(fraction62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction39", (fraction6.compareTo(fraction39) == 0) == fraction6.equals(fraction39));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.divideBy(fraction12);
        java.lang.String str14 = fraction13.toString();
        long long15 = fraction13.longValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction9.subtract(fraction13);
        double double17 = fraction9.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.divideBy(fraction20);
        java.lang.String str22 = fraction21.toString();
        int int23 = fraction21.getProperNumerator();
        float float24 = fraction21.floatValue();
        java.lang.String str25 = fraction21.toProperString();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction9.multiplyBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction21.negate();
        int int28 = fraction1.compareTo(fraction27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction1 and fraction9", (fraction1.compareTo(fraction9) == 0) == fraction1.equals(fraction9));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 32, (int) (short) 32);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.divideBy(fraction6);
        java.lang.String str8 = fraction7.toString();
        long long9 = fraction7.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.subtract(fraction7);
        double double11 = fraction3.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.divideBy(fraction14);
        java.lang.String str16 = fraction15.toString();
        int int17 = fraction15.getProperNumerator();
        float float18 = fraction15.floatValue();
        java.lang.String str19 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction3.multiplyBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction2.multiplyBy(fraction3);
        int int22 = fraction3.getProperWhole();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction21", (fraction3.compareTo(fraction21) == 0) == fraction3.equals(fraction21));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.negate();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int15 = fraction10.compareTo(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction6.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.multiplyBy(fraction18);
        java.lang.String str20 = fraction18.toString();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction29 = fraction22.multiplyBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction18.add(fraction26);
        boolean boolean33 = fraction16.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int36 = fraction35.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction35.divideBy(fraction37);
        java.lang.String str39 = fraction38.toString();
        long long40 = fraction38.longValue();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction34.subtract(fraction38);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int44 = fraction43.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction46 = fraction43.divideBy(fraction45);
        java.lang.String str47 = fraction46.toString();
        long long48 = fraction46.longValue();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction42.subtract(fraction46);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction38.divideBy(fraction46);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction51.invert();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction55.negate();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction51.subtract(fraction56);
        long long58 = fraction57.longValue();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction61.negate();
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int66 = fraction61.compareTo(fraction65);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction57.multiplyBy(fraction61);
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction69 = fraction68.invert();
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction73 = fraction72.negate();
        org.apache.commons.lang3.math.Fraction fraction74 = fraction68.subtract(fraction73);
        org.apache.commons.lang3.math.Fraction fraction76 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction77 = fraction73.multiplyBy(fraction76);
        org.apache.commons.lang3.math.Fraction fraction78 = fraction61.subtract(fraction73);
        org.apache.commons.lang3.math.Fraction fraction79 = fraction46.multiplyBy(fraction61);
        double double80 = fraction46.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction81 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction82 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int83 = fraction82.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction84 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction85 = fraction82.divideBy(fraction84);
        java.lang.String str86 = fraction85.toString();
        long long87 = fraction85.longValue();
        org.apache.commons.lang3.math.Fraction fraction88 = fraction81.subtract(fraction85);
        int int89 = fraction85.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction90 = fraction46.divideBy(fraction85);
        org.apache.commons.lang3.math.Fraction fraction91 = fraction18.divideBy(fraction46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction18 and fraction34", (fraction18.compareTo(fraction34) == 0) == fraction18.equals(fraction34));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int3 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.divideBy(fraction4);
        java.lang.String str6 = fraction5.toString();
        long long7 = fraction5.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction5);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.divideBy(fraction10);
        java.lang.String str12 = fraction11.toProperString();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction0.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction24 = fraction17.multiplyBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction21.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int28 = fraction27.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction30 = fraction27.divideBy(fraction29);
        java.lang.String str31 = fraction30.toString();
        int int32 = fraction30.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction30.reduce();
        int int34 = fraction33.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction26.multiplyBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.divideBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction35.pow(0);
        int int40 = fraction11.compareTo(fraction35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction1 and fraction16", (fraction1.compareTo(fraction16) == 0) == fraction1.equals(fraction16));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 32, (int) (short) 32);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.divideBy(fraction6);
        java.lang.String str8 = fraction7.toString();
        long long9 = fraction7.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.subtract(fraction7);
        double double11 = fraction3.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.divideBy(fraction14);
        java.lang.String str16 = fraction15.toString();
        int int17 = fraction15.getProperNumerator();
        float float18 = fraction15.floatValue();
        java.lang.String str19 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction3.multiplyBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction2.multiplyBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction21", (fraction3.compareTo(fraction21) == 0) == fraction3.equals(fraction21));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        boolean boolean6 = fraction2.equals((java.lang.Object) fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 32, (int) (short) 32);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.divideBy(fraction13);
        java.lang.String str15 = fraction14.toString();
        long long16 = fraction14.longValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction10.subtract(fraction14);
        double double18 = fraction10.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int20 = fraction19.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction19.divideBy(fraction21);
        java.lang.String str23 = fraction22.toString();
        int int24 = fraction22.getProperNumerator();
        float float25 = fraction22.floatValue();
        java.lang.String str26 = fraction22.toProperString();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction10.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction9.multiplyBy(fraction10);
        int int29 = fraction2.compareTo(fraction10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction10 and fraction28", (fraction10.compareTo(fraction28) == 0) == fraction10.equals(fraction28));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 32, (int) (short) 32);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.divideBy(fraction6);
        java.lang.String str8 = fraction7.toString();
        long long9 = fraction7.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.subtract(fraction7);
        double double11 = fraction3.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.divideBy(fraction14);
        java.lang.String str16 = fraction15.toString();
        int int17 = fraction15.getProperNumerator();
        float float18 = fraction15.floatValue();
        java.lang.String str19 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction3.multiplyBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction2.multiplyBy(fraction3);
        short short22 = fraction3.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction21", (fraction3.compareTo(fraction21) == 0) == fraction3.equals(fraction21));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction0.reduce();
        int int19 = fraction0.intValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction18", (fraction0.compareTo(fraction18) == 0) == fraction0.equals(fraction18));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double1 = fraction0.doubleValue();
        long long2 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.multiplyBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.divideBy(fraction16);
        java.lang.String str18 = fraction17.toString();
        int int19 = fraction17.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.reduce();
        int int21 = fraction20.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction13.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction0.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction31.divideBy(fraction33);
        java.lang.String str35 = fraction34.toString();
        long long36 = fraction34.longValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction30.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction29.add(fraction30);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.invert();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction39.subtract(fraction44);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction44.multiplyBy(fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int51 = fraction50.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction53 = fraction50.divideBy(fraction52);
        java.lang.String str54 = fraction53.toString();
        long long55 = fraction53.longValue();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction49.subtract(fraction53);
        int int57 = fraction56.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction59 = fraction56.divideBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction48.divideBy(fraction59);
        int int61 = fraction30.compareTo(fraction60);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction60.invert();
        long long63 = fraction62.longValue();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction0.add(fraction62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction30", (fraction3.compareTo(fraction30) == 0) == fraction3.equals(fraction30));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int3 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.divideBy(fraction4);
        java.lang.String str6 = fraction5.toString();
        int int7 = fraction5.getProperNumerator();
        float float8 = fraction5.floatValue();
        java.lang.String str9 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int18 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.divideBy(fraction19);
        java.lang.String str21 = fraction20.toString();
        long long22 = fraction20.longValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction16.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction15.add(fraction16);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction5.multiplyBy(fraction24);
        int int26 = fraction24.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction24.reduce();
        int int28 = fraction1.compareTo(fraction27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction24 and fraction27", (fraction24.compareTo(fraction27) == 0) == fraction24.equals(fraction27));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.divideBy(fraction13);
        java.lang.String str15 = fraction14.toString();
        int int16 = fraction14.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.reduce();
        int int18 = fraction17.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction10.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction30 = fraction23.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.pow((int) (byte) -1);
        int int33 = fraction32.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction20.subtract(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int37 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction39 = fraction36.divideBy(fraction38);
        java.lang.String str40 = fraction39.toString();
        long long41 = fraction39.longValue();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction35.subtract(fraction39);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int45 = fraction44.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction47 = fraction44.divideBy(fraction46);
        java.lang.String str48 = fraction47.toString();
        long long49 = fraction47.longValue();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction43.subtract(fraction47);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction39.divideBy(fraction47);
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int54 = fraction53.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction56 = fraction55.invert();
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction59.negate();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction55.subtract(fraction60);
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction60.multiplyBy(fraction63);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction64.abs();
        boolean boolean66 = fraction53.equals((java.lang.Object) fraction65);
        boolean boolean67 = fraction47.equals((java.lang.Object) fraction53);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction34.add(fraction53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction35", (fraction0.compareTo(fraction35) == 0) == fraction0.equals(fraction35));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.abs();
        java.lang.String str11 = fraction10.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction13.divideBy(fraction15);
        java.lang.String str17 = fraction16.toString();
        long long18 = fraction16.longValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction12.subtract(fraction16);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.divideBy(fraction23);
        java.lang.String str25 = fraction24.toString();
        long long26 = fraction24.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction16.divideBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int31 = fraction30.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction36.negate();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction32.subtract(fraction37);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction37.multiplyBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.abs();
        boolean boolean43 = fraction30.equals((java.lang.Object) fraction42);
        boolean boolean44 = fraction24.equals((java.lang.Object) fraction30);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction10.add(fraction24);
        float float46 = fraction10.floatValue();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction10.reduce();
        double double48 = fraction10.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int50 = fraction49.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction49.divideBy(fraction51);
        java.lang.String str53 = fraction52.toString();
        long long54 = fraction52.longValue();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction57 = fraction55.multiplyBy(fraction56);
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction60.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction63 = fraction56.multiplyBy(fraction60);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction60.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int67 = fraction66.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction69 = fraction66.divideBy(fraction68);
        java.lang.String str70 = fraction69.toString();
        int int71 = fraction69.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction72 = fraction69.reduce();
        int int73 = fraction72.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction74 = fraction65.multiplyBy(fraction72);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction52.multiplyBy(fraction72);
        int int76 = fraction75.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction10.subtract(fraction75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction12 and fraction55", (fraction12.compareTo(fraction55) == 0) == fraction12.equals(fraction55));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction11.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction7.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.reduce();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction7.subtract(fraction25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction24", (fraction7.compareTo(fraction24) == 0) == fraction7.equals(fraction24));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int20 = fraction19.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction19.divideBy(fraction21);
        java.lang.String str23 = fraction22.toString();
        long long24 = fraction22.longValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction18.subtract(fraction22);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction28 = fraction25.divideBy(fraction27);
        java.lang.String str29 = fraction28.toProperString();
        float float30 = fraction28.floatValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction28.invert();
        float float32 = fraction28.floatValue();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction0.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction36.add(fraction37);
        int int39 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction33.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.multiplyBy(fraction42);
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction46.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction49 = fraction42.multiplyBy(fraction46);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction46.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int53 = fraction52.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction55 = fraction52.divideBy(fraction54);
        java.lang.String str56 = fraction55.toString();
        int int57 = fraction55.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction55.reduce();
        int int59 = fraction58.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction51.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction62 = fraction60.divideBy(fraction61);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction60.pow(0);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction40.add(fraction60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction41", (fraction0.compareTo(fraction41) == 0) == fraction0.equals(fraction41));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double10 = fraction9.doubleValue();
        long long11 = fraction9.longValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.multiplyBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction20 = fraction13.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction23.divideBy(fraction25);
        java.lang.String str27 = fraction26.toString();
        int int28 = fraction26.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction26.reduce();
        int int30 = fraction29.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction22.multiplyBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction9.subtract(fraction29);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction8.subtract(fraction29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction12", (fraction0.compareTo(fraction12) == 0) == fraction0.equals(fraction12));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.divideBy(fraction13);
        java.lang.String str15 = fraction14.toString();
        int int16 = fraction14.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.reduce();
        int int18 = fraction17.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction10.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction23.divideBy(fraction25);
        java.lang.String str27 = fraction26.toString();
        long long28 = fraction26.longValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction22.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction31.divideBy(fraction33);
        java.lang.String str35 = fraction34.toString();
        long long36 = fraction34.longValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction30.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction26.divideBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.invert();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction39.subtract(fraction44);
        long long46 = fraction45.longValue();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.negate();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int54 = fraction49.compareTo(fraction53);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction45.multiplyBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction57 = fraction56.invert();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction60.negate();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction56.subtract(fraction61);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction61.multiplyBy(fraction64);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction49.subtract(fraction61);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction34.multiplyBy(fraction49);
        double double68 = fraction34.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int71 = fraction70.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction73 = fraction70.divideBy(fraction72);
        java.lang.String str74 = fraction73.toString();
        long long75 = fraction73.longValue();
        org.apache.commons.lang3.math.Fraction fraction76 = fraction69.subtract(fraction73);
        int int77 = fraction73.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction78 = fraction34.divideBy(fraction73);
        int int79 = fraction73.getDenominator();
        boolean boolean80 = fraction21.equals((java.lang.Object) fraction73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction22", (fraction0.compareTo(fraction22) == 0) == fraction0.equals(fraction22));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        long long9 = fraction7.longValue();
        int int10 = fraction7.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.divideBy(fraction14);
        java.lang.String str16 = fraction15.toString();
        long long17 = fraction15.longValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.subtract(fraction15);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction20.divideBy(fraction22);
        java.lang.String str24 = fraction23.toString();
        long long25 = fraction23.longValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction19.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction15.divideBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.negate();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction28.subtract(fraction33);
        long long35 = fraction34.longValue();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction38.negate();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int43 = fraction38.compareTo(fraction42);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction34.multiplyBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction46 = fraction45.invert();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.negate();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction45.subtract(fraction50);
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction50.multiplyBy(fraction53);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction38.subtract(fraction50);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction23.multiplyBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction7.divideBy(fraction56);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int60 = fraction59.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction62 = fraction59.divideBy(fraction61);
        java.lang.String str63 = fraction62.toString();
        long long64 = fraction62.longValue();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction58.subtract(fraction62);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction65.reduce();
        boolean boolean67 = fraction56.equals((java.lang.Object) fraction65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction66", (fraction7.compareTo(fraction66) == 0) == fraction7.equals(fraction66));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction0.reduce();
        java.lang.String str19 = fraction0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction18", (fraction0.compareTo(fraction18) == 0) == fraction0.equals(fraction18));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 0, (-5));
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(100);
        java.lang.String str5 = fraction4.toProperString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction4", (fraction2.compareTo(fraction4) == 0) == fraction2.equals(fraction4));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        java.lang.String str3 = fraction1.toString();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction12 = fraction5.multiplyBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction1.add(fraction9);
        int int16 = fraction9.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.pow(3);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction9.subtract(fraction18);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction23.divideBy(fraction25);
        java.lang.String str27 = fraction26.toString();
        long long28 = fraction26.longValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction22.subtract(fraction26);
        double double30 = fraction22.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction31.divideBy(fraction33);
        java.lang.String str35 = fraction34.toString();
        int int36 = fraction34.getProperNumerator();
        float float37 = fraction34.floatValue();
        java.lang.String str38 = fraction34.toProperString();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction22.multiplyBy(fraction34);
        int int40 = fraction18.compareTo(fraction39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction22", (fraction0.compareTo(fraction22) == 0) == fraction0.equals(fraction22));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) ' ');
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.divideBy(fraction6);
        java.lang.String str8 = fraction7.toString();
        long long9 = fraction7.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.reduce();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction2.add(fraction10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction10 and fraction11", (fraction10.compareTo(fraction11) == 0) == fraction10.equals(fraction11));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((-3), 6005);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction0.add(fraction21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction18", (fraction0.compareTo(fraction18) == 0) == fraction0.equals(fraction18));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("5/6");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.divideBy(fraction5);
        java.lang.String str7 = fraction6.toString();
        long long8 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.subtract(fraction6);
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        int int13 = fraction11.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction1.multiplyBy(fraction11);
        short short15 = fraction1.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction14", (fraction2.compareTo(fraction14) == 0) == fraction2.equals(fraction14));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.divideBy(fraction20);
        java.lang.String str22 = fraction21.toString();
        int int23 = fraction21.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.reduce();
        int int25 = fraction24.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction17.multiplyBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.divideBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction26.pow(0);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction6.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction36.negate();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction32.subtract(fraction37);
        long long39 = fraction38.longValue();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction42.negate();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int47 = fraction42.compareTo(fraction46);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction38.multiplyBy(fraction42);
        java.lang.String str49 = fraction38.toProperString();
        boolean boolean50 = fraction31.equals((java.lang.Object) fraction38);
        long long51 = fraction31.longValue();
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int54 = fraction53.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction56 = fraction53.divideBy(fraction55);
        java.lang.String str57 = fraction56.toString();
        long long58 = fraction56.longValue();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction52.subtract(fraction56);
        int int60 = fraction59.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction62 = fraction59.divideBy(fraction61);
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction65 = fraction64.invert();
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction68.negate();
        org.apache.commons.lang3.math.Fraction fraction70 = fraction64.subtract(fraction69);
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction73 = fraction69.multiplyBy(fraction72);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction63.divideBy(fraction72);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction59.multiplyBy(fraction74);
        int int76 = fraction74.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getReducedFraction(8, 8);
        org.apache.commons.lang3.math.Fraction fraction80 = fraction74.multiplyBy(fraction79);
        org.apache.commons.lang3.math.Fraction fraction81 = fraction31.multiplyBy(fraction79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction52", (fraction7.compareTo(fraction52) == 0) == fraction7.equals(fraction52));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction11.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction7.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.reduce();
        java.lang.Class<?> wildcardClass25 = fraction7.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction24", (fraction7.compareTo(fraction24) == 0) == fraction7.equals(fraction24));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.negate();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int15 = fraction10.compareTo(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction6.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.multiplyBy(fraction18);
        java.lang.String str20 = fraction18.toString();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction29 = fraction22.multiplyBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction18.add(fraction26);
        boolean boolean33 = fraction16.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction18.negate();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction36 = fraction35.invert();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.negate();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction35.subtract(fraction40);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction40.multiplyBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction44.abs();
        java.lang.String str46 = fraction45.toProperString();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int49 = fraction48.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction51 = fraction48.divideBy(fraction50);
        java.lang.String str52 = fraction51.toString();
        long long53 = fraction51.longValue();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction47.subtract(fraction51);
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int57 = fraction56.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction59 = fraction56.divideBy(fraction58);
        java.lang.String str60 = fraction59.toString();
        long long61 = fraction59.longValue();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction55.subtract(fraction59);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction51.divideBy(fraction59);
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int66 = fraction65.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction68 = fraction67.invert();
        org.apache.commons.lang3.math.Fraction fraction71 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction71.negate();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction67.subtract(fraction72);
        org.apache.commons.lang3.math.Fraction fraction75 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction72.multiplyBy(fraction75);
        org.apache.commons.lang3.math.Fraction fraction77 = fraction76.abs();
        boolean boolean78 = fraction65.equals((java.lang.Object) fraction77);
        boolean boolean79 = fraction59.equals((java.lang.Object) fraction65);
        org.apache.commons.lang3.math.Fraction fraction80 = fraction45.add(fraction59);
        float float81 = fraction45.floatValue();
        org.apache.commons.lang3.math.Fraction fraction82 = fraction45.reduce();
        double double83 = fraction45.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction84 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int85 = fraction84.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction86 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction87 = fraction84.divideBy(fraction86);
        java.lang.String str88 = fraction87.toString();
        int int89 = fraction87.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction90 = fraction87.reduce();
        org.apache.commons.lang3.math.Fraction fraction91 = fraction45.subtract(fraction90);
        org.apache.commons.lang3.math.Fraction fraction92 = fraction34.add(fraction90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction17 and fraction47", (fraction17.compareTo(fraction47) == 0) == fraction17.equals(fraction47));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, 10);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.multiplyBy(fraction4);
        java.lang.String str6 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction4.add(fraction12);
        int int19 = fraction12.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.pow(3);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction12.subtract(fraction21);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction2.add(fraction12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction12", (fraction2.compareTo(fraction12) == 0) == fraction2.equals(fraction12));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.abs();
        java.lang.String str11 = fraction10.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction13.divideBy(fraction15);
        java.lang.String str17 = fraction16.toString();
        long long18 = fraction16.longValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction12.subtract(fraction16);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.divideBy(fraction23);
        java.lang.String str25 = fraction24.toString();
        long long26 = fraction24.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction16.divideBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int31 = fraction30.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction36.negate();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction32.subtract(fraction37);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction37.multiplyBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.abs();
        boolean boolean43 = fraction30.equals((java.lang.Object) fraction42);
        boolean boolean44 = fraction24.equals((java.lang.Object) fraction30);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction10.add(fraction24);
        double double46 = fraction45.doubleValue();
        int int47 = fraction45.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        long long50 = fraction49.longValue();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction45.divideBy(fraction49);
        int int52 = fraction51.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction57 = fraction55.add(fraction56);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction60 = fraction58.multiplyBy(fraction59);
        java.lang.String str61 = fraction59.toString();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction64 = fraction62.multiplyBy(fraction63);
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction67.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction70 = fraction63.multiplyBy(fraction67);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction67.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction73 = fraction59.add(fraction67);
        int int74 = fraction67.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction76 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction78 = fraction76.pow(3);
        org.apache.commons.lang3.math.Fraction fraction79 = fraction67.subtract(fraction76);
        org.apache.commons.lang3.math.Fraction fraction80 = fraction76.negate();
        org.apache.commons.lang3.math.Fraction fraction81 = fraction55.subtract(fraction76);
        org.apache.commons.lang3.math.Fraction fraction82 = fraction51.divideBy(fraction55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction12 and fraction58", (fraction12.compareTo(fraction58) == 0) == fraction12.equals(fraction58));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.subtract(fraction6);
        long long8 = fraction7.longValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.negate();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int16 = fraction11.compareTo(fraction15);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction7.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.negate();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction18.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction23.multiplyBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction11.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction0.add(fraction23);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double31 = fraction30.doubleValue();
        long long32 = fraction30.longValue();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction33.multiplyBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction38.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction41 = fraction34.multiplyBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction38.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int45 = fraction44.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction47 = fraction44.divideBy(fraction46);
        java.lang.String str48 = fraction47.toString();
        int int49 = fraction47.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction47.reduce();
        int int51 = fraction50.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction43.multiplyBy(fraction50);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction30.subtract(fraction50);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction29.divideBy(fraction50);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction54.invert();
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int58 = fraction57.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction60 = fraction57.divideBy(fraction59);
        java.lang.String str61 = fraction60.toString();
        long long62 = fraction60.longValue();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction56.subtract(fraction60);
        int int64 = fraction63.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction66 = fraction63.divideBy(fraction65);
        java.lang.String str67 = fraction66.toProperString();
        float float68 = fraction66.floatValue();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction66.invert();
        int int70 = fraction69.getProperWhole();
        int int71 = fraction69.getProperWhole();
        int int72 = fraction55.compareTo(fraction69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction33 and fraction56", (fraction33.compareTo(fraction56) == 0) == fraction33.equals(fraction56));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        java.lang.String str11 = fraction10.toString();
        long long12 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction6);
        java.lang.String str15 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int18 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.divideBy(fraction19);
        java.lang.String str21 = fraction20.toString();
        long long22 = fraction20.longValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction16.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction28 = fraction25.divideBy(fraction27);
        java.lang.String str29 = fraction28.toString();
        long long30 = fraction28.longValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction24.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction20.divideBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.negate();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction33.subtract(fraction38);
        long long40 = fraction39.longValue();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int48 = fraction43.compareTo(fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction39.multiplyBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction51 = fraction50.invert();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction54.negate();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction50.subtract(fraction55);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction55.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction43.subtract(fraction55);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction28.multiplyBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction6.add(fraction43);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        int int65 = fraction6.compareTo(fraction64);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction6.reduce();
        int int67 = fraction6.getProperWhole();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction66", (fraction6.compareTo(fraction66) == 0) == fraction6.equals(fraction66));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 32, (int) (short) 32);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.divideBy(fraction6);
        java.lang.String str8 = fraction7.toString();
        long long9 = fraction7.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.subtract(fraction7);
        double double11 = fraction3.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.divideBy(fraction14);
        java.lang.String str16 = fraction15.toString();
        int int17 = fraction15.getProperNumerator();
        float float18 = fraction15.floatValue();
        java.lang.String str19 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction3.multiplyBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction2.multiplyBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction23.divideBy(fraction25);
        java.lang.String str27 = fraction26.toString();
        long long28 = fraction26.longValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction22.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction31.divideBy(fraction33);
        java.lang.String str35 = fraction34.toString();
        long long36 = fraction34.longValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction30.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction26.divideBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.invert();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction39.subtract(fraction44);
        long long46 = fraction45.longValue();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.negate();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int54 = fraction49.compareTo(fraction53);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction45.multiplyBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction57 = fraction56.invert();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction60.negate();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction56.subtract(fraction61);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction61.multiplyBy(fraction64);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction49.subtract(fraction61);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction34.multiplyBy(fraction49);
        double double68 = fraction34.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int71 = fraction70.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction73 = fraction70.divideBy(fraction72);
        java.lang.String str74 = fraction73.toString();
        long long75 = fraction73.longValue();
        org.apache.commons.lang3.math.Fraction fraction76 = fraction69.subtract(fraction73);
        int int77 = fraction73.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction78 = fraction34.divideBy(fraction73);
        float float79 = fraction73.floatValue();
        org.apache.commons.lang3.math.Fraction fraction80 = fraction73.negate();
        org.apache.commons.lang3.math.Fraction fraction81 = fraction2.add(fraction80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction21", (fraction3.compareTo(fraction21) == 0) == fraction3.equals(fraction21));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        long long14 = fraction12.longValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction4.divideBy(fraction12);
        int int17 = fraction16.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.multiplyBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction26 = fraction19.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction16.multiplyBy(fraction19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction19", (fraction0.compareTo(fraction19) == 0) == fraction0.equals(fraction19));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.add(fraction12);
        java.lang.String str14 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction22.divideBy(fraction24);
        java.lang.String str26 = fraction25.toString();
        long long27 = fraction25.longValue();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction21.subtract(fraction25);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction20.add(fraction21);
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction12.multiplyBy(fraction29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction21", (fraction0.compareTo(fraction21) == 0) == fraction0.equals(fraction21));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.divideBy(fraction13);
        java.lang.String str15 = fraction14.toString();
        int int16 = fraction14.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.reduce();
        int int18 = fraction17.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction10.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.divideBy(fraction23);
        java.lang.String str25 = fraction24.toString();
        long long26 = fraction24.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.subtract(fraction24);
        double double28 = fraction20.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int30 = fraction29.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction29.divideBy(fraction31);
        java.lang.String str33 = fraction32.toString();
        int int34 = fraction32.getProperNumerator();
        float float35 = fraction32.floatValue();
        java.lang.String str36 = fraction32.toProperString();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction20.multiplyBy(fraction32);
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int40 = fraction39.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction42 = fraction39.divideBy(fraction41);
        java.lang.String str43 = fraction42.toString();
        long long44 = fraction42.longValue();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction38.subtract(fraction42);
        int int46 = fraction45.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction48 = fraction45.divideBy(fraction47);
        java.lang.String str49 = fraction48.toProperString();
        float float50 = fraction48.floatValue();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction48.invert();
        float float52 = fraction48.floatValue();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction20.subtract(fraction48);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction19.add(fraction53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction20", (fraction0.compareTo(fraction20) == 0) == fraction0.equals(fraction20));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction11.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction7.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.reduce();
        long long25 = fraction24.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction24", (fraction7.compareTo(fraction24) == 0) == fraction7.equals(fraction24));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1000.0d));
        java.lang.String str2 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.divideBy(fraction12);
        java.lang.String str14 = fraction13.toString();
        long long15 = fraction13.longValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction9.subtract(fraction13);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction8.add(fraction9);
        java.lang.String str18 = fraction9.toProperString();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction20.divideBy(fraction22);
        java.lang.String str24 = fraction23.toString();
        long long25 = fraction23.longValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction19.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int29 = fraction28.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction31 = fraction28.divideBy(fraction30);
        java.lang.String str32 = fraction31.toString();
        long long33 = fraction31.longValue();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction27.subtract(fraction31);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction23.divideBy(fraction31);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction37 = fraction36.invert();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction40.negate();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction36.subtract(fraction41);
        long long43 = fraction42.longValue();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction46.negate();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int51 = fraction46.compareTo(fraction50);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction42.multiplyBy(fraction46);
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction54 = fraction53.invert();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction57.negate();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction53.subtract(fraction58);
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction58.multiplyBy(fraction61);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction46.subtract(fraction58);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction31.multiplyBy(fraction46);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction9.add(fraction46);
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        int int68 = fraction9.compareTo(fraction67);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction70 = fraction1.multiplyBy(fraction9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction9 and fraction69", (fraction9.compareTo(fraction69) == 0) == fraction9.equals(fraction69));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.negate();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        java.lang.String str21 = fraction20.toProperString();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int23 = fraction20.compareTo(fraction22);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction29 = fraction26.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction22.subtract(fraction29);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction18.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.negate();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.negate();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction33.subtract(fraction38);
        long long40 = fraction39.longValue();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int48 = fraction43.compareTo(fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction39.multiplyBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction51 = fraction50.invert();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction54.negate();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction50.subtract(fraction55);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction55.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction43.subtract(fraction55);
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction62 = fraction61.invert();
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction65.negate();
        org.apache.commons.lang3.math.Fraction fraction67 = fraction61.subtract(fraction66);
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction66.multiplyBy(fraction69);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction70.abs();
        java.lang.String str72 = fraction71.toProperString();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction60.subtract(fraction71);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction60.invert();
        org.apache.commons.lang3.math.Fraction fraction75 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int76 = fraction75.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction75.reduce();
        org.apache.commons.lang3.math.Fraction fraction78 = fraction60.add(fraction77);
        org.apache.commons.lang3.math.Fraction fraction79 = fraction32.add(fraction77);
        org.apache.commons.lang3.math.Fraction fraction80 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction81 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction82 = fraction80.multiplyBy(fraction81);
        org.apache.commons.lang3.math.Fraction fraction85 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction87 = fraction85.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction88 = fraction81.multiplyBy(fraction85);
        java.lang.String str89 = fraction81.toProperString();
        org.apache.commons.lang3.math.Fraction fraction90 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int91 = fraction90.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction92 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction93 = fraction90.divideBy(fraction92);
        java.lang.String str94 = fraction93.toString();
        int int95 = fraction93.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction96 = fraction93.reduce();
        boolean boolean97 = fraction81.equals((java.lang.Object) fraction96);
        org.apache.commons.lang3.math.Fraction fraction98 = fraction79.multiplyBy(fraction81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction81", (fraction0.compareTo(fraction81) == 0) == fraction0.equals(fraction81));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.negate();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int15 = fraction10.compareTo(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction6.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.negate();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction17.subtract(fraction22);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction22.multiplyBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction10.subtract(fraction22);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.negate();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction28.subtract(fraction33);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction33.multiplyBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.abs();
        java.lang.String str39 = fraction38.toProperString();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction27.subtract(fraction38);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction27.invert();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int43 = fraction42.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction42.reduce();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction27.add(fraction44);
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int48 = fraction47.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction50 = fraction47.divideBy(fraction49);
        java.lang.String str51 = fraction50.toString();
        long long52 = fraction50.longValue();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction46.subtract(fraction50);
        double double54 = fraction46.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int56 = fraction55.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction55.divideBy(fraction57);
        java.lang.String str59 = fraction58.toString();
        int int60 = fraction58.getProperNumerator();
        float float61 = fraction58.floatValue();
        java.lang.String str62 = fraction58.toProperString();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction46.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int66 = fraction65.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction68 = fraction65.divideBy(fraction67);
        java.lang.String str69 = fraction68.toString();
        long long70 = fraction68.longValue();
        org.apache.commons.lang3.math.Fraction fraction71 = fraction64.subtract(fraction68);
        int int72 = fraction71.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction74 = fraction71.divideBy(fraction73);
        java.lang.String str75 = fraction74.toProperString();
        float float76 = fraction74.floatValue();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction74.invert();
        float float78 = fraction74.floatValue();
        org.apache.commons.lang3.math.Fraction fraction79 = fraction46.subtract(fraction74);
        int int80 = fraction27.compareTo(fraction46);
        org.apache.commons.lang3.math.Fraction fraction83 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -10, 8);
        org.apache.commons.lang3.math.Fraction fraction84 = fraction83.abs();
        int int85 = fraction83.getDenominator();
        int int86 = fraction46.compareTo(fraction83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction1 and fraction84", (fraction1.compareTo(fraction84) == 0) == fraction1.equals(fraction84));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 0, (-5));
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(100);
        short short5 = fraction2.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction4", (fraction2.compareTo(fraction4) == 0) == fraction2.equals(fraction4));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double1 = fraction0.doubleValue();
        long long2 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.multiplyBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.divideBy(fraction16);
        java.lang.String str18 = fraction17.toString();
        int int19 = fraction17.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.reduce();
        int int21 = fraction20.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction13.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction0.subtract(fraction20);
        int int24 = fraction0.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.subtract(fraction30);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction30.multiplyBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.abs();
        java.lang.String str36 = fraction35.toProperString();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int39 = fraction38.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction38.divideBy(fraction40);
        java.lang.String str42 = fraction41.toString();
        long long43 = fraction41.longValue();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction37.subtract(fraction41);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int47 = fraction46.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction49 = fraction46.divideBy(fraction48);
        java.lang.String str50 = fraction49.toString();
        long long51 = fraction49.longValue();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction45.subtract(fraction49);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction41.divideBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int56 = fraction55.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction57.invert();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction61.negate();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction57.subtract(fraction62);
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction62.multiplyBy(fraction65);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction66.abs();
        boolean boolean68 = fraction55.equals((java.lang.Object) fraction67);
        boolean boolean69 = fraction49.equals((java.lang.Object) fraction55);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction35.add(fraction49);
        float float71 = fraction35.floatValue();
        org.apache.commons.lang3.math.Fraction fraction72 = fraction35.invert();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction0.divideBy(fraction35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction37", (fraction3.compareTo(fraction37) == 0) == fraction3.equals(fraction37));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.negate();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction14.subtract(fraction19);
        long long21 = fraction20.longValue();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.negate();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int29 = fraction24.compareTo(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction20.multiplyBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.invert();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction35.negate();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction31.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction36.multiplyBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction24.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction43 = fraction42.invert();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction46.negate();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction42.subtract(fraction47);
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction47.multiplyBy(fraction50);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction51.abs();
        java.lang.String str53 = fraction52.toProperString();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction41.subtract(fraction52);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction13.subtract(fraction41);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction4.add(fraction55);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction59 = fraction57.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction62.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction65 = fraction58.multiplyBy(fraction62);
        float float66 = fraction62.floatValue();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction62.pow((-2));
        org.apache.commons.lang3.math.Fraction fraction69 = fraction4.divideBy(fraction62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction57", (fraction0.compareTo(fraction57) == 0) == fraction0.equals(fraction57));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double1 = fraction0.doubleValue();
        long long2 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.divideBy(fraction5);
        java.lang.String str7 = fraction6.toString();
        int int8 = fraction6.getProperNumerator();
        float float9 = fraction6.floatValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.add(fraction6);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction("2/4");
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction13.negate();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction13.negate();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction("10 4/5");
        int int18 = fraction17.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction15.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.multiplyBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction25.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction28 = fraction21.multiplyBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction31.divideBy(fraction33);
        java.lang.String str35 = fraction34.toString();
        int int36 = fraction34.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction34.reduce();
        int int38 = fraction37.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction30.multiplyBy(fraction37);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.divideBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction44 = fraction42.multiplyBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction47.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction50 = fraction43.multiplyBy(fraction47);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction47.pow((int) (byte) -1);
        int int53 = fraction52.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction40.subtract(fraction52);
        int int55 = fraction17.compareTo(fraction52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction12 and fraction20", (fraction12.compareTo(fraction20) == 0) == fraction12.equals(fraction20));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -10, 8);
        int int3 = fraction2.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.reduce();
        java.lang.Class<?> wildcardClass5 = fraction4.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction4", (fraction2.compareTo(fraction4) == 0) == fraction2.equals(fraction4));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.reduce();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((-10), 5, 2);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction7.add(fraction12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction8", (fraction7.compareTo(fraction8) == 0) == fraction7.equals(fraction8));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -10, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.multiplyBy(fraction7);
        java.lang.String str9 = fraction7.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.multiplyBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction15.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction7.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction15.pow((int) (short) -1);
        boolean boolean24 = fraction5.equals((java.lang.Object) fraction15);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (int) (short) 100, 1);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction15.divideBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction2.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int33 = fraction32.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.divideBy(fraction34);
        java.lang.String str36 = fraction35.toString();
        long long37 = fraction35.longValue();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction31.subtract(fraction35);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int41 = fraction40.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction43 = fraction40.divideBy(fraction42);
        java.lang.String str44 = fraction43.toString();
        long long45 = fraction43.longValue();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction39.subtract(fraction43);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction35.divideBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction49 = fraction48.invert();
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction52.negate();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction48.subtract(fraction53);
        long long55 = fraction54.longValue();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction58.negate();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int63 = fraction58.compareTo(fraction62);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction54.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction66 = fraction65.invert();
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction69.negate();
        org.apache.commons.lang3.math.Fraction fraction71 = fraction65.subtract(fraction70);
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction70.multiplyBy(fraction73);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction58.subtract(fraction70);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction43.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction80 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction81 = fraction79.add(fraction80);
        int int82 = fraction79.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction83 = fraction58.divideBy(fraction79);
        int int84 = fraction79.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction85 = fraction30.divideBy(fraction79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction31", (fraction6.compareTo(fraction31) == 0) == fraction6.equals(fraction31));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -10, 8);
        int int3 = fraction2.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.reduce();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.pow((-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction4", (fraction2.compareTo(fraction4) == 0) == fraction2.equals(fraction4));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.add(fraction12);
        java.lang.String str14 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.negate();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int18 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.divideBy(fraction19);
        java.lang.String str21 = fraction20.toString();
        long long22 = fraction20.longValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction16.subtract(fraction20);
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction23.divideBy(fraction25);
        int int27 = fraction26.getProperWhole();
        java.lang.String str28 = fraction26.toString();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction15.divideBy(fraction26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction16", (fraction0.compareTo(fraction16) == 0) == fraction0.equals(fraction16));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.add(fraction3);
        java.lang.String str5 = fraction2.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        java.lang.String str11 = fraction10.toString();
        long long12 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction15.divideBy(fraction17);
        java.lang.String str19 = fraction18.toString();
        long long20 = fraction18.longValue();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction14.subtract(fraction18);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction10.divideBy(fraction18);
        int int23 = fraction18.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction28 = fraction25.divideBy(fraction27);
        java.lang.String str29 = fraction28.toString();
        long long30 = fraction28.longValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction24.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int34 = fraction33.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction36 = fraction33.divideBy(fraction35);
        java.lang.String str37 = fraction36.toString();
        long long38 = fraction36.longValue();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction32.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction28.divideBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.invert();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction45.negate();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction41.subtract(fraction46);
        long long48 = fraction47.longValue();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction51.negate();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int56 = fraction51.compareTo(fraction55);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction47.multiplyBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction59 = fraction58.invert();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction62.negate();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction58.subtract(fraction63);
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction63.multiplyBy(fraction66);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction51.subtract(fraction63);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction36.multiplyBy(fraction51);
        double double70 = fraction36.doubleValue();
        int int71 = fraction18.compareTo(fraction36);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction2.multiplyBy(fraction18);
        double double73 = fraction18.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction74 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction75 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction76 = fraction74.multiplyBy(fraction75);
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction81 = fraction79.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction82 = fraction75.multiplyBy(fraction79);
        org.apache.commons.lang3.math.Fraction fraction86 = org.apache.commons.lang3.math.Fraction.getFraction(100, 1, 2);
        org.apache.commons.lang3.math.Fraction fraction87 = fraction82.multiplyBy(fraction86);
        org.apache.commons.lang3.math.Fraction fraction88 = fraction86.invert();
        boolean boolean89 = fraction18.equals((java.lang.Object) fraction86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction74", (fraction6.compareTo(fraction74) == 0) == fraction6.equals(fraction74));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.add(fraction12);
        int int14 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction16.divideBy(fraction18);
        java.lang.String str20 = fraction19.toString();
        long long21 = fraction19.longValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction15.subtract(fraction19);
        double double23 = fraction15.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int25 = fraction24.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction27 = fraction24.divideBy(fraction26);
        java.lang.String str28 = fraction27.toString();
        int int29 = fraction27.getProperNumerator();
        float float30 = fraction27.floatValue();
        java.lang.String str31 = fraction27.toProperString();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction15.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction27.negate();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        java.lang.String str36 = fraction35.toProperString();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int38 = fraction35.compareTo(fraction37);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction44 = fraction41.invert();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction37.subtract(fraction44);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction33.divideBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((-1000.0d));
        org.apache.commons.lang3.math.Fraction fraction49 = fraction33.subtract(fraction48);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction12.multiplyBy(fraction48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction15", (fraction0.compareTo(fraction15) == 0) == fraction0.equals(fraction15));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -10, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.multiplyBy(fraction7);
        java.lang.String str9 = fraction7.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.multiplyBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction15.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction7.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction15.pow((int) (short) -1);
        boolean boolean24 = fraction5.equals((java.lang.Object) fraction15);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (int) (short) 100, 1);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction15.divideBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction2.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int33 = fraction32.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.divideBy(fraction34);
        java.lang.String str36 = fraction35.toString();
        long long37 = fraction35.longValue();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction31.subtract(fraction35);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int41 = fraction40.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction43 = fraction40.divideBy(fraction42);
        java.lang.String str44 = fraction43.toString();
        long long45 = fraction43.longValue();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction39.subtract(fraction43);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction35.divideBy(fraction43);
        int int48 = fraction47.getProperNumerator();
        long long49 = fraction47.longValue();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction30.multiplyBy(fraction47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction31", (fraction6.compareTo(fraction31) == 0) == fraction6.equals(fraction31));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.negate();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction7.subtract(fraction12);
        long long14 = fraction13.longValue();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.negate();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int22 = fraction17.compareTo(fraction21);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction13.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction0.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction23.pow(0);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction("1/10");
        org.apache.commons.lang3.math.Fraction fraction30 = fraction27.add(fraction29);
        long long31 = fraction30.longValue();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -10, 8);
        int int35 = fraction34.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.reduce();
        int int37 = fraction30.compareTo(fraction34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction34 and fraction36", (fraction34.compareTo(fraction36) == 0) == fraction34.equals(fraction36));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction18", (fraction0.compareTo(fraction18) == 0) == fraction0.equals(fraction18));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.add(fraction1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.negate();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.subtract(fraction8);
        int int10 = fraction3.getDenominator();
        int int11 = fraction3.intValue();
        boolean boolean13 = fraction3.equals((java.lang.Object) (-2));
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.divideBy(fraction23);
        java.lang.String str25 = fraction24.toString();
        long long26 = fraction24.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction19.add(fraction20);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.invert();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.negate();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction29.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction34.multiplyBy(fraction37);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int41 = fraction40.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction43 = fraction40.divideBy(fraction42);
        java.lang.String str44 = fraction43.toString();
        long long45 = fraction43.longValue();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction39.subtract(fraction43);
        int int47 = fraction46.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction49 = fraction46.divideBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction38.divideBy(fraction49);
        int int51 = fraction20.compareTo(fraction50);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction3.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction2.subtract(fraction3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction20", (fraction0.compareTo(fraction20) == 0) == fraction0.equals(fraction20));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction0.reduce();
        java.lang.Class<?> wildcardClass19 = fraction18.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction18", (fraction0.compareTo(fraction18) == 0) == fraction0.equals(fraction18));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.divideBy(fraction13);
        java.lang.String str15 = fraction14.toString();
        int int16 = fraction14.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.reduce();
        int int18 = fraction17.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction10.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.divideBy(fraction23);
        java.lang.String str25 = fraction24.toString();
        long long26 = fraction24.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.subtract(fraction24);
        float float28 = fraction24.floatValue();
        java.lang.String str29 = fraction24.toProperString();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getFraction("2 1/2");
        org.apache.commons.lang3.math.Fraction fraction33 = fraction30.multiplyBy(fraction32);
        int int34 = fraction30.getProperNumerator();
        boolean boolean35 = fraction24.equals((java.lang.Object) fraction30);
        int int36 = fraction24.getProperNumerator();
        int int37 = fraction17.compareTo(fraction24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction20", (fraction0.compareTo(fraction20) == 0) == fraction0.equals(fraction20));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        long long9 = fraction7.longValue();
        int int10 = fraction7.intValue();
        double double11 = fraction7.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction(1.0d);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        boolean boolean20 = fraction16.equals((java.lang.Object) fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction13.add(fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.negate();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction22.subtract(fraction27);
        java.lang.String str29 = fraction22.toProperString();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.pow((int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction22.divideBy(fraction30);
        int int34 = fraction19.compareTo(fraction33);
        double double35 = fraction33.doubleValue();
        java.lang.String str36 = fraction33.toString();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction33.reduce();
        boolean boolean38 = fraction7.equals((java.lang.Object) fraction37);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction7.reduce();
        byte byte40 = fraction7.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction39", (fraction7.compareTo(fraction39) == 0) == fraction7.equals(fraction39));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int20 = fraction19.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction19.divideBy(fraction21);
        java.lang.String str23 = fraction22.toString();
        long long24 = fraction22.longValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction18.subtract(fraction22);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction28 = fraction25.divideBy(fraction27);
        java.lang.String str29 = fraction28.toProperString();
        float float30 = fraction28.floatValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction28.invert();
        float float32 = fraction28.floatValue();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction0.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction36.add(fraction37);
        int int39 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction33.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        java.lang.String str43 = fraction42.toProperString();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int45 = fraction42.compareTo(fraction44);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction48.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction51 = fraction48.invert();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction44.subtract(fraction51);
        int int53 = fraction44.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction44.reduce();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction36.subtract(fraction54);
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction56.multiplyBy(fraction57);
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction61.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction64 = fraction57.multiplyBy(fraction61);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction61.pow((int) (byte) -1);
        int int67 = fraction66.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction70 = fraction68.multiplyBy(fraction69);
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction73.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction76 = fraction69.multiplyBy(fraction73);
        org.apache.commons.lang3.math.Fraction fraction80 = org.apache.commons.lang3.math.Fraction.getFraction(100, 1, 2);
        org.apache.commons.lang3.math.Fraction fraction81 = fraction76.multiplyBy(fraction80);
        int int82 = fraction66.compareTo(fraction76);
        org.apache.commons.lang3.math.Fraction fraction83 = fraction76.reduce();
        org.apache.commons.lang3.math.Fraction fraction84 = fraction55.subtract(fraction83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction56", (fraction0.compareTo(fraction56) == 0) == fraction0.equals(fraction56));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("5/6");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.divideBy(fraction5);
        java.lang.String str7 = fraction6.toString();
        long long8 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.subtract(fraction6);
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        int int13 = fraction11.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction1.multiplyBy(fraction11);
        byte byte15 = fraction11.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction14", (fraction2.compareTo(fraction14) == 0) == fraction2.equals(fraction14));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(3, 6);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.reduce();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction3", (fraction2.compareTo(fraction3) == 0) == fraction2.equals(fraction3));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction14 = fraction13.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction16.divideBy(fraction18);
        java.lang.String str20 = fraction19.toString();
        long long21 = fraction19.longValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction15.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction14.add(fraction15);
        java.lang.String str24 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction29 = fraction26.divideBy(fraction28);
        java.lang.String str30 = fraction29.toString();
        long long31 = fraction29.longValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction25.subtract(fraction29);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int35 = fraction34.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction37 = fraction34.divideBy(fraction36);
        java.lang.String str38 = fraction37.toString();
        long long39 = fraction37.longValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction33.subtract(fraction37);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction29.divideBy(fraction37);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction43 = fraction42.invert();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction46.negate();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction42.subtract(fraction47);
        long long49 = fraction48.longValue();
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction52.negate();
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int57 = fraction52.compareTo(fraction56);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction48.multiplyBy(fraction52);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction60 = fraction59.invert();
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction63.negate();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction59.subtract(fraction64);
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction64.multiplyBy(fraction67);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction52.subtract(fraction64);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction37.multiplyBy(fraction52);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction15.add(fraction52);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction8.divideBy(fraction71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction15", (fraction0.compareTo(fraction15) == 0) == fraction0.equals(fraction15));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("5/6");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.divideBy(fraction5);
        java.lang.String str7 = fraction6.toString();
        long long8 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.subtract(fraction6);
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        int int13 = fraction11.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction1.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction11.invert();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction14", (fraction2.compareTo(fraction14) == 0) == fraction2.equals(fraction14));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction11.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction7.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.reduce();
        int int25 = fraction7.intValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction24", (fraction7.compareTo(fraction24) == 0) == fraction7.equals(fraction24));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        float float8 = fraction4.floatValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        long long14 = fraction12.longValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.multiplyBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction23 = fraction16.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction20.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction29 = fraction26.divideBy(fraction28);
        java.lang.String str30 = fraction29.toString();
        int int31 = fraction29.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction29.reduce();
        int int33 = fraction32.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction25.multiplyBy(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction12.multiplyBy(fraction32);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction4.subtract(fraction12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction15", (fraction0.compareTo(fraction15) == 0) == fraction0.equals(fraction15));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        float float8 = fraction4.floatValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction13.negate();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.subtract(fraction14);
        long long16 = fraction15.longValue();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int24 = fraction19.compareTo(fraction23);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction15.multiplyBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction30.negate();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction26.subtract(fraction31);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction31.multiplyBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction19.subtract(fraction31);
        java.lang.String str37 = fraction19.toProperString();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction4.multiplyBy(fraction19);
        int int39 = fraction38.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        boolean boolean46 = fraction42.equals((java.lang.Object) fraction45);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction45.invert();
        int int48 = fraction47.getDenominator();
        java.lang.String str49 = fraction47.toString();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction50.multiplyBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction55.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction58 = fraction51.multiplyBy(fraction55);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction55.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction55.reduce();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction61.negate();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction61.abs();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction47.divideBy(fraction61);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction38.divideBy(fraction47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction50", (fraction0.compareTo(fraction50) == 0) == fraction0.equals(fraction50));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2 1/2");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction("2");
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.negate();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction13.multiplyBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.abs();
        java.lang.String str19 = fraction18.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.divideBy(fraction23);
        java.lang.String str25 = fraction24.toString();
        long long26 = fraction24.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int30 = fraction29.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction29.divideBy(fraction31);
        java.lang.String str33 = fraction32.toString();
        long long34 = fraction32.longValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction28.subtract(fraction32);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction24.divideBy(fraction32);
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int39 = fraction38.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction40.invert();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction44.negate();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction40.subtract(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction45.multiplyBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.abs();
        boolean boolean51 = fraction38.equals((java.lang.Object) fraction50);
        boolean boolean52 = fraction32.equals((java.lang.Object) fraction38);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction18.add(fraction32);
        int int54 = fraction53.getNumerator();
        boolean boolean55 = fraction5.equals((java.lang.Object) fraction53);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction2.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction57.negate();
        int int59 = fraction58.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction58.negate();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction63 = fraction61.multiplyBy(fraction62);
        java.lang.String str64 = fraction62.toString();
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction67 = fraction65.multiplyBy(fraction66);
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction70.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction73 = fraction66.multiplyBy(fraction70);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction70.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction62.add(fraction70);
        int int77 = fraction70.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction81 = fraction79.pow(3);
        org.apache.commons.lang3.math.Fraction fraction82 = fraction70.subtract(fraction79);
        org.apache.commons.lang3.math.Fraction fraction83 = fraction79.negate();
        java.lang.String str84 = fraction83.toProperString();
        org.apache.commons.lang3.math.Fraction fraction85 = fraction58.subtract(fraction83);
        org.apache.commons.lang3.math.Fraction fraction86 = fraction56.add(fraction85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction20 and fraction61", (fraction20.compareTo(fraction61) == 0) == fraction20.equals(fraction61));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        float float9 = fraction5.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction5.pow((-2));
        double double12 = fraction11.doubleValue();
        int int13 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.negate();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction14.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction19.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.abs();
        java.lang.String str25 = fraction24.toProperString();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int28 = fraction27.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction30 = fraction27.divideBy(fraction29);
        java.lang.String str31 = fraction30.toString();
        long long32 = fraction30.longValue();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction26.subtract(fraction30);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int36 = fraction35.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction35.divideBy(fraction37);
        java.lang.String str39 = fraction38.toString();
        long long40 = fraction38.longValue();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction34.subtract(fraction38);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction30.divideBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int45 = fraction44.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction47 = fraction46.invert();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction50.negate();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction46.subtract(fraction51);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction51.multiplyBy(fraction54);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction55.abs();
        boolean boolean57 = fraction44.equals((java.lang.Object) fraction56);
        boolean boolean58 = fraction38.equals((java.lang.Object) fraction44);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction24.add(fraction38);
        float float60 = fraction24.floatValue();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction24.reduce();
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-5), 1);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction24.multiplyBy(fraction64);
        boolean boolean66 = fraction11.equals((java.lang.Object) fraction65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction26", (fraction0.compareTo(fraction26) == 0) == fraction0.equals(fraction26));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction11.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction7.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.reduce();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction24", (fraction7.compareTo(fraction24) == 0) == fraction7.equals(fraction24));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("5/6");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.divideBy(fraction5);
        java.lang.String str7 = fraction6.toString();
        long long8 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.subtract(fraction6);
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        int int13 = fraction11.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction1.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction15.subtract(fraction20);
        java.lang.String str22 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.pow((int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction15.divideBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        java.lang.String str29 = fraction28.toProperString();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int31 = fraction28.compareTo(fraction30);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction37 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction30.subtract(fraction37);
        int int39 = fraction30.getProperNumerator();
        boolean boolean40 = fraction23.equals((java.lang.Object) fraction30);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction14.add(fraction30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction14", (fraction2.compareTo(fraction14) == 0) == fraction2.equals(fraction14));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.divideBy(fraction13);
        java.lang.String str15 = fraction14.toString();
        int int16 = fraction14.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.reduce();
        int int18 = fraction17.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction10.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction30 = fraction23.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.pow((int) (byte) -1);
        int int33 = fraction32.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction20.subtract(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.negate();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction38.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction41 = fraction40.invert();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int44 = fraction43.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction46 = fraction43.divideBy(fraction45);
        java.lang.String str47 = fraction46.toString();
        long long48 = fraction46.longValue();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction42.subtract(fraction46);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction41.add(fraction42);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction51.invert();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction55.negate();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction51.subtract(fraction56);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction56.multiplyBy(fraction59);
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int63 = fraction62.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction65 = fraction62.divideBy(fraction64);
        java.lang.String str66 = fraction65.toString();
        long long67 = fraction65.longValue();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction61.subtract(fraction65);
        int int69 = fraction68.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction71 = fraction68.divideBy(fraction70);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction60.divideBy(fraction71);
        int int73 = fraction42.compareTo(fraction72);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction72.invert();
        org.apache.commons.lang3.math.Fraction fraction75 = fraction74.invert();
        org.apache.commons.lang3.math.Fraction fraction76 = fraction75.reduce();
        int int77 = fraction75.getProperWhole();
        int int78 = fraction32.compareTo(fraction75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction42", (fraction0.compareTo(fraction42) == 0) == fraction0.equals(fraction42));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        double double8 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        int int14 = fraction12.getProperNumerator();
        float float15 = fraction12.floatValue();
        java.lang.String str16 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.multiplyBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction26 = fraction19.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction23.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction23.reduce();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        java.lang.String str33 = fraction32.toProperString();
        int int34 = fraction32.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction30.divideBy(fraction32);
        int int36 = fraction32.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction0.add(fraction32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction18", (fraction0.compareTo(fraction18) == 0) == fraction0.equals(fraction18));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.divideBy(fraction20);
        java.lang.String str22 = fraction21.toString();
        int int23 = fraction21.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.reduce();
        int int25 = fraction24.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction17.multiplyBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.divideBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction26.pow(0);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction6.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int34 = fraction33.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction36 = fraction33.divideBy(fraction35);
        java.lang.String str37 = fraction36.toString();
        long long38 = fraction36.longValue();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction32.subtract(fraction36);
        double double40 = fraction32.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double42 = fraction41.doubleValue();
        long long43 = fraction41.longValue();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int45 = fraction44.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction47 = fraction44.divideBy(fraction46);
        java.lang.String str48 = fraction47.toString();
        int int49 = fraction47.getProperNumerator();
        float float50 = fraction47.floatValue();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction41.add(fraction47);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction32.divideBy(fraction41);
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int55 = fraction54.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction57 = fraction54.divideBy(fraction56);
        java.lang.String str58 = fraction57.toString();
        long long59 = fraction57.longValue();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction53.subtract(fraction57);
        double double61 = fraction53.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double63 = fraction62.doubleValue();
        long long64 = fraction62.longValue();
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int66 = fraction65.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction68 = fraction65.divideBy(fraction67);
        java.lang.String str69 = fraction68.toString();
        int int70 = fraction68.getProperNumerator();
        float float71 = fraction68.floatValue();
        org.apache.commons.lang3.math.Fraction fraction72 = fraction62.add(fraction68);
        org.apache.commons.lang3.math.Fraction fraction73 = fraction53.divideBy(fraction62);
        boolean boolean74 = fraction41.equals((java.lang.Object) fraction53);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction31.multiplyBy(fraction53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction53", (fraction7.compareTo(fraction53) == 0) == fraction7.equals(fraction53));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        long long14 = fraction12.longValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction4.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.negate();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction17.subtract(fraction22);
        long long24 = fraction23.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction27.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int32 = fraction27.compareTo(fraction31);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction23.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction38.negate();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction34.subtract(fraction39);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction39.multiplyBy(fraction42);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction27.subtract(fraction39);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction12.multiplyBy(fraction27);
        double double46 = fraction12.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int49 = fraction48.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction51 = fraction48.divideBy(fraction50);
        java.lang.String str52 = fraction51.toString();
        long long53 = fraction51.longValue();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction47.subtract(fraction51);
        int int55 = fraction51.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction12.divideBy(fraction51);
        float float57 = fraction51.floatValue();
        int int58 = fraction51.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int60 = fraction59.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction62 = fraction59.divideBy(fraction61);
        java.lang.String str63 = fraction62.toString();
        int int64 = fraction62.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction62.reduce();
        int int66 = fraction65.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.getReducedFraction(42, (int) (byte) 10);
        double double70 = fraction69.doubleValue();
        int int71 = fraction65.compareTo(fraction69);
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction74 = fraction72.multiplyBy(fraction73);
        org.apache.commons.lang3.math.Fraction fraction77 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction79 = fraction77.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction80 = fraction73.multiplyBy(fraction77);
        org.apache.commons.lang3.math.Fraction fraction82 = fraction77.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction84 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction85 = fraction82.add(fraction84);
        java.lang.String str86 = fraction84.toString();
        org.apache.commons.lang3.math.Fraction fraction87 = fraction84.negate();
        org.apache.commons.lang3.math.Fraction fraction88 = fraction65.add(fraction84);
        int int89 = fraction51.compareTo(fraction88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction72", (fraction0.compareTo(fraction72) == 0) == fraction0.equals(fraction72));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, 4);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((int) (short) 42);
        int int5 = fraction4.getProperWhole();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction4", (fraction2.compareTo(fraction4) == 0) == fraction2.equals(fraction4));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.divideBy(fraction2);
        java.lang.String str4 = fraction3.toString();
        int int5 = fraction3.getProperNumerator();
        float float6 = fraction3.floatValue();
        java.lang.String str7 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction15.divideBy(fraction17);
        java.lang.String str19 = fraction18.toString();
        long long20 = fraction18.longValue();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction14.subtract(fraction18);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction13.add(fraction14);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction3.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 2);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction(100, 1, 2);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction30.negate();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction26.subtract(fraction30);
        java.lang.String str33 = fraction26.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction24.add(fraction26);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction("5/6");
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int39 = fraction38.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction38.divideBy(fraction40);
        java.lang.String str42 = fraction41.toString();
        long long43 = fraction41.longValue();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction37.subtract(fraction41);
        int int45 = fraction44.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction47 = fraction44.divideBy(fraction46);
        int int48 = fraction46.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction36.multiplyBy(fraction46);
        boolean boolean50 = fraction34.equals((java.lang.Object) fraction36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction14 and fraction49", (fraction14.compareTo(fraction49) == 0) == fraction14.equals(fraction49));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        java.lang.String str7 = fraction0.toProperString();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.pow((int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        java.lang.String str14 = fraction13.toProperString();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int16 = fraction13.compareTo(fraction15);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction22 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction15.subtract(fraction22);
        int int24 = fraction15.getProperNumerator();
        boolean boolean25 = fraction8.equals((java.lang.Object) fraction15);
        int int26 = fraction15.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction15.pow((int) (short) -1);
        int int29 = fraction15.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 32, (int) (short) 32);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int35 = fraction34.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction37 = fraction34.divideBy(fraction36);
        java.lang.String str38 = fraction37.toString();
        long long39 = fraction37.longValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction33.subtract(fraction37);
        double double41 = fraction33.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int43 = fraction42.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction45 = fraction42.divideBy(fraction44);
        java.lang.String str46 = fraction45.toString();
        int int47 = fraction45.getProperNumerator();
        float float48 = fraction45.floatValue();
        java.lang.String str49 = fraction45.toProperString();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction33.multiplyBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction32.multiplyBy(fraction33);
        boolean boolean52 = fraction15.equals((java.lang.Object) fraction51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction33 and fraction51", (fraction33.compareTo(fraction51) == 0) == fraction33.equals(fraction51));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        java.lang.String str11 = fraction10.toString();
        long long12 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction6);
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction14.negate();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.reduce();
        int int18 = fraction17.getProperNumerator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction16 and fraction17", (fraction16.compareTo(fraction17) == 0) == fraction16.equals(fraction17));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.negate();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int15 = fraction10.compareTo(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction6.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.multiplyBy(fraction18);
        java.lang.String str20 = fraction18.toString();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction29 = fraction22.multiplyBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction18.add(fraction26);
        boolean boolean33 = fraction16.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction18.reduce();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int37 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction39 = fraction36.divideBy(fraction38);
        java.lang.String str40 = fraction39.toString();
        long long41 = fraction39.longValue();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction35.subtract(fraction39);
        int int43 = fraction42.getNumerator();
        long long44 = fraction42.longValue();
        int int45 = fraction42.intValue();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int48 = fraction47.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction50 = fraction47.divideBy(fraction49);
        java.lang.String str51 = fraction50.toString();
        long long52 = fraction50.longValue();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction46.subtract(fraction50);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int56 = fraction55.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction55.divideBy(fraction57);
        java.lang.String str59 = fraction58.toString();
        long long60 = fraction58.longValue();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction54.subtract(fraction58);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction50.divideBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction64 = fraction63.invert();
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction67.negate();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction63.subtract(fraction68);
        long long70 = fraction69.longValue();
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction73.negate();
        org.apache.commons.lang3.math.Fraction fraction77 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int78 = fraction73.compareTo(fraction77);
        org.apache.commons.lang3.math.Fraction fraction79 = fraction69.multiplyBy(fraction73);
        org.apache.commons.lang3.math.Fraction fraction80 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction81 = fraction80.invert();
        org.apache.commons.lang3.math.Fraction fraction84 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction85 = fraction84.negate();
        org.apache.commons.lang3.math.Fraction fraction86 = fraction80.subtract(fraction85);
        org.apache.commons.lang3.math.Fraction fraction88 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction89 = fraction85.multiplyBy(fraction88);
        org.apache.commons.lang3.math.Fraction fraction90 = fraction73.subtract(fraction85);
        org.apache.commons.lang3.math.Fraction fraction91 = fraction58.multiplyBy(fraction73);
        org.apache.commons.lang3.math.Fraction fraction92 = fraction42.divideBy(fraction91);
        long long93 = fraction91.longValue();
        int int94 = fraction18.compareTo(fraction91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction18 and fraction35", (fraction18.compareTo(fraction35) == 0) == fraction18.equals(fraction35));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction17.multiplyBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction11.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction7.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.reduce();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction27 = fraction25.multiplyBy(fraction26);
        java.lang.String str28 = fraction26.toString();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.multiplyBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction37 = fraction30.multiplyBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction34.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction26.add(fraction34);
        long long41 = fraction26.longValue();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction26.reduce();
        boolean boolean43 = fraction7.equals((java.lang.Object) fraction26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction26", (fraction0.compareTo(fraction26) == 0) == fraction0.equals(fraction26));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        java.lang.String str11 = fraction10.toString();
        long long12 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction6);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction15.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction20.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction29 = fraction26.divideBy(fraction28);
        java.lang.String str30 = fraction29.toString();
        long long31 = fraction29.longValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction25.subtract(fraction29);
        int int33 = fraction32.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.divideBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction24.divideBy(fraction35);
        int int37 = fraction6.compareTo(fraction36);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction6.abs();
        int int39 = fraction38.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction42 = fraction40.multiplyBy(fraction41);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction45.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction48 = fraction41.multiplyBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction45.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int52 = fraction51.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction54 = fraction51.divideBy(fraction53);
        java.lang.String str55 = fraction54.toString();
        int int56 = fraction54.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction54.reduce();
        int int58 = fraction57.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction50.multiplyBy(fraction57);
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction61 = fraction59.divideBy(fraction60);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction64 = fraction62.multiplyBy(fraction63);
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction67.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction70 = fraction63.multiplyBy(fraction67);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction67.pow((int) (byte) -1);
        int int73 = fraction72.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction74 = fraction60.subtract(fraction72);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction60.negate();
        java.lang.String str76 = fraction75.toProperString();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction38.multiplyBy(fraction75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction38 and fraction40", (fraction38.compareTo(fraction40) == 0) == fraction38.equals(fraction40));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) ' ');
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.add(fraction7);
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.divideBy(fraction13);
        java.lang.String str15 = fraction14.toString();
        long long16 = fraction14.longValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction10.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int20 = fraction19.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction19.divideBy(fraction21);
        java.lang.String str23 = fraction22.toString();
        long long24 = fraction22.longValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction18.subtract(fraction22);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction14.divideBy(fraction22);
        int int27 = fraction22.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int30 = fraction29.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction29.divideBy(fraction31);
        java.lang.String str33 = fraction32.toString();
        long long34 = fraction32.longValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction28.subtract(fraction32);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int38 = fraction37.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.divideBy(fraction39);
        java.lang.String str41 = fraction40.toString();
        long long42 = fraction40.longValue();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction36.subtract(fraction40);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction32.divideBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction46 = fraction45.invert();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.negate();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction45.subtract(fraction50);
        long long52 = fraction51.longValue();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction55.negate();
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int60 = fraction55.compareTo(fraction59);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction51.multiplyBy(fraction55);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction63 = fraction62.invert();
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction66.negate();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction62.subtract(fraction67);
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction67.multiplyBy(fraction70);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction55.subtract(fraction67);
        org.apache.commons.lang3.math.Fraction fraction73 = fraction40.multiplyBy(fraction55);
        double double74 = fraction40.doubleValue();
        int int75 = fraction22.compareTo(fraction40);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction6.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction77 = fraction2.divideBy(fraction22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction77", (fraction2.compareTo(fraction77) == 0) == fraction2.equals(fraction77));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.abs();
        java.lang.String str11 = fraction10.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction13.divideBy(fraction15);
        java.lang.String str17 = fraction16.toString();
        long long18 = fraction16.longValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction12.subtract(fraction16);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.divideBy(fraction23);
        java.lang.String str25 = fraction24.toString();
        long long26 = fraction24.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction16.divideBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int31 = fraction30.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction36.negate();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction32.subtract(fraction37);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction37.multiplyBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.abs();
        boolean boolean43 = fraction30.equals((java.lang.Object) fraction42);
        boolean boolean44 = fraction24.equals((java.lang.Object) fraction30);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction10.add(fraction24);
        int int46 = fraction45.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction45.reduce();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction45.invert();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction51 = fraction49.multiplyBy(fraction50);
        java.lang.String str52 = fraction50.toString();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction55 = fraction53.multiplyBy(fraction54);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction58.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction61 = fraction54.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction58.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction50.add(fraction58);
        int int65 = fraction58.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction67.pow(3);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction58.subtract(fraction67);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction45.add(fraction70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction12 and fraction49", (fraction12.compareTo(fraction49) == 0) == fraction12.equals(fraction49));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 4);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.multiplyBy(fraction4);
        java.lang.String str6 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction4.add(fraction12);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.pow((int) (short) -1);
        boolean boolean21 = fraction2.equals((java.lang.Object) fraction12);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.negate();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction22.subtract(fraction27);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction27.multiplyBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.abs();
        java.lang.String str33 = fraction32.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int36 = fraction35.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction35.divideBy(fraction37);
        java.lang.String str39 = fraction38.toString();
        long long40 = fraction38.longValue();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction34.subtract(fraction38);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int44 = fraction43.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction46 = fraction43.divideBy(fraction45);
        java.lang.String str47 = fraction46.toString();
        long long48 = fraction46.longValue();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction42.subtract(fraction46);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction38.divideBy(fraction46);
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int53 = fraction52.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction55 = fraction54.invert();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction58.negate();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction54.subtract(fraction59);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction59.multiplyBy(fraction62);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction63.abs();
        boolean boolean65 = fraction52.equals((java.lang.Object) fraction64);
        boolean boolean66 = fraction46.equals((java.lang.Object) fraction52);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction32.add(fraction46);
        float float68 = fraction32.floatValue();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction32.reduce();
        double double70 = fraction32.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction71 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int72 = fraction71.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction74 = fraction71.divideBy(fraction73);
        java.lang.String str75 = fraction74.toString();
        int int76 = fraction74.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction74.reduce();
        org.apache.commons.lang3.math.Fraction fraction78 = fraction32.subtract(fraction77);
        java.lang.String str79 = fraction78.toString();
        org.apache.commons.lang3.math.Fraction fraction80 = fraction2.multiplyBy(fraction78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction34", (fraction3.compareTo(fraction34) == 0) == fraction3.equals(fraction34));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.negate();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction4.subtract(fraction9);
        long long11 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int19 = fraction14.compareTo(fraction18);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction10.multiplyBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.negate();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction21.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction26.multiplyBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction14.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction36.negate();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction32.subtract(fraction37);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction37.multiplyBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.abs();
        java.lang.String str43 = fraction42.toProperString();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction31.subtract(fraction42);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction46 = fraction45.invert();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.negate();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction45.subtract(fraction50);
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction50.multiplyBy(fraction53);
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int57 = fraction56.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction59 = fraction56.divideBy(fraction58);
        java.lang.String str60 = fraction59.toString();
        long long61 = fraction59.longValue();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction55.subtract(fraction59);
        int int63 = fraction62.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction65 = fraction62.divideBy(fraction64);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction54.divideBy(fraction65);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction54.reduce();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction44.add(fraction67);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction3.divideBy(fraction68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction55", (fraction0.compareTo(fraction55) == 0) == fraction0.equals(fraction55));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(1.0d);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        boolean boolean8 = fraction4.equals((java.lang.Object) fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.add(fraction7);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((-10));
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.multiplyBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction20 = fraction13.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction23.divideBy(fraction25);
        java.lang.String str27 = fraction26.toString();
        int int28 = fraction26.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction26.reduce();
        int int30 = fraction29.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction22.multiplyBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction31.divideBy(fraction32);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.multiplyBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction42 = fraction35.multiplyBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction39.pow((int) (byte) -1);
        int int45 = fraction44.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction32.subtract(fraction44);
        boolean boolean47 = fraction11.equals((java.lang.Object) fraction44);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int50 = fraction49.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction49.divideBy(fraction51);
        java.lang.String str53 = fraction52.toString();
        long long54 = fraction52.longValue();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction48.subtract(fraction52);
        double double56 = fraction48.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double58 = fraction57.doubleValue();
        long long59 = fraction57.longValue();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int61 = fraction60.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction63 = fraction60.divideBy(fraction62);
        java.lang.String str64 = fraction63.toString();
        int int65 = fraction63.getProperNumerator();
        float float66 = fraction63.floatValue();
        org.apache.commons.lang3.math.Fraction fraction67 = fraction57.add(fraction63);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction48.divideBy(fraction57);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction11.add(fraction48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction12 and fraction48", (fraction12.compareTo(fraction48) == 0) == fraction12.equals(fraction48));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 0, (-5));
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(100);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.negate();
        int int9 = fraction7.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.negate();
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.invert();
        java.lang.String str13 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.negate();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction14.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.negate();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction21.subtract(fraction26);
        long long28 = fraction27.longValue();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.negate();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int36 = fraction31.compareTo(fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction27.multiplyBy(fraction31);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction14.subtract(fraction37);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction37.invert();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction37.pow(0);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction("1/10");
        org.apache.commons.lang3.math.Fraction fraction44 = fraction41.add(fraction43);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction12.multiplyBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction12.reduce();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction2.divideBy(fraction12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction48", (fraction2.compareTo(fraction48) == 0) == fraction2.equals(fraction48));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        int int4 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction5.divideBy(fraction7);
        java.lang.String str9 = fraction8.toString();
        int int10 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.reduce();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.add(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction2.divideBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction20.negate();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction16.subtract(fraction21);
        long long23 = fraction22.longValue();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.negate();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int31 = fraction26.compareTo(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction22.multiplyBy(fraction26);
        float float33 = fraction26.floatValue();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction26.negate();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction14.divideBy(fraction26);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int39 = fraction38.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction38.divideBy(fraction40);
        java.lang.String str42 = fraction41.toString();
        long long43 = fraction41.longValue();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction37.subtract(fraction41);
        int int45 = fraction44.getNumerator();
        long long46 = fraction44.longValue();
        int int47 = fraction44.intValue();
        double double48 = fraction44.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double50 = fraction49.doubleValue();
        long long51 = fraction49.longValue();
        float float52 = fraction49.floatValue();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int54 = fraction53.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction56 = fraction53.divideBy(fraction55);
        java.lang.String str57 = fraction56.toString();
        int int58 = fraction56.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction56.reduce();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction61 = fraction60.invert();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction59.add(fraction60);
        boolean boolean63 = fraction49.equals((java.lang.Object) fraction59);
        int int64 = fraction59.getProperWhole();
        int int65 = fraction44.compareTo(fraction59);
        boolean boolean66 = fraction35.equals((java.lang.Object) fraction59);
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction69 = fraction67.multiplyBy(fraction68);
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction72.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction75 = fraction68.multiplyBy(fraction72);
        org.apache.commons.lang3.math.Fraction fraction77 = fraction72.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction80 = fraction77.add(fraction79);
        long long81 = fraction77.longValue();
        int int82 = fraction35.compareTo(fraction77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction37 and fraction67", (fraction37.compareTo(fraction67) == 0) == fraction37.equals(fraction67));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        java.lang.String str3 = fraction1.toString();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction12 = fraction5.multiplyBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction1.add(fraction9);
        int int16 = fraction9.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.pow(3);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction9.subtract(fraction18);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction18.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction("2 1/2");
        org.apache.commons.lang3.math.Fraction fraction26 = fraction23.multiplyBy(fraction25);
        int int27 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction18.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.multiplyBy(fraction31);
        java.lang.String str33 = fraction31.toString();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.multiplyBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction42 = fraction35.multiplyBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction39.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction31.add(fraction39);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction39.reduce();
        int int47 = fraction18.compareTo(fraction39);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int50 = fraction49.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction49.divideBy(fraction51);
        java.lang.String str53 = fraction52.toString();
        long long54 = fraction52.longValue();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction48.subtract(fraction52);
        int int56 = fraction55.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction55.divideBy(fraction57);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction61 = fraction60.invert();
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction64.negate();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction60.subtract(fraction65);
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction65.multiplyBy(fraction68);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction59.divideBy(fraction68);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction55.multiplyBy(fraction70);
        float float72 = fraction71.floatValue();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction18.multiplyBy(fraction71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction48", (fraction0.compareTo(fraction48) == 0) == fraction0.equals(fraction48));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        java.lang.String str11 = fraction10.toString();
        long long12 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction6);
        java.lang.String str15 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int18 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.divideBy(fraction19);
        java.lang.String str21 = fraction20.toString();
        long long22 = fraction20.longValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction16.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction28 = fraction25.divideBy(fraction27);
        java.lang.String str29 = fraction28.toString();
        long long30 = fraction28.longValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction24.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction20.divideBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.negate();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction33.subtract(fraction38);
        long long40 = fraction39.longValue();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int48 = fraction43.compareTo(fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction39.multiplyBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction51 = fraction50.invert();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction54.negate();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction50.subtract(fraction55);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction55.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction43.subtract(fraction55);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction28.multiplyBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction6.add(fraction43);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        int int65 = fraction6.compareTo(fraction64);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction6.reduce();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction66.pow((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction66", (fraction6.compareTo(fraction66) == 0) == fraction6.equals(fraction66));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.negate();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int15 = fraction10.compareTo(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction6.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.multiplyBy(fraction18);
        java.lang.String str20 = fraction18.toString();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction29 = fraction22.multiplyBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction18.add(fraction26);
        boolean boolean33 = fraction16.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction16.invert();
        java.lang.String str35 = fraction16.toString();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int38 = fraction37.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.divideBy(fraction39);
        java.lang.String str41 = fraction40.toString();
        long long42 = fraction40.longValue();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction36.subtract(fraction40);
        int int44 = fraction43.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double47 = fraction46.doubleValue();
        long long48 = fraction46.longValue();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int50 = fraction49.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction49.divideBy(fraction51);
        java.lang.String str53 = fraction52.toString();
        int int54 = fraction52.getProperNumerator();
        float float55 = fraction52.floatValue();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction46.add(fraction52);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getFraction("2/4");
        org.apache.commons.lang3.math.Fraction fraction59 = fraction56.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction59.negate();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction45.multiplyBy(fraction60);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction66 = fraction64.add(fraction65);
        int int67 = fraction64.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction45.divideBy(fraction64);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction16.divideBy(fraction45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction17 and fraction36", (fraction17.compareTo(fraction36) == 0) == fraction17.equals(fraction36));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.pow(3);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getReducedFraction(5, (int) (short) -1);
        float float9 = fraction8.floatValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -10, 8);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.abs();
        int int17 = fraction16.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.reduce();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction10.add(fraction18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction16 and fraction18", (fraction16.compareTo(fraction18) == 0) == fraction16.equals(fraction18));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.subtract(fraction1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.subtract(fraction3);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.divideBy(fraction10);
        java.lang.String str12 = fraction11.toString();
        long long13 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction7.subtract(fraction11);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.negate();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction19.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction24.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction18.divideBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction14.multiplyBy(fraction29);
        int int31 = fraction29.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getReducedFraction(8, 8);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction29.multiplyBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction6.multiplyBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.invert();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.negate();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction37.subtract(fraction42);
        long long44 = fraction43.longValue();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction47.negate();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int52 = fraction47.compareTo(fraction51);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction43.multiplyBy(fraction47);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction56 = fraction54.multiplyBy(fraction55);
        java.lang.String str57 = fraction55.toString();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction60 = fraction58.multiplyBy(fraction59);
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction63.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction66 = fraction59.multiplyBy(fraction63);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction63.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction55.add(fraction63);
        boolean boolean70 = fraction53.equals((java.lang.Object) fraction55);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction55.reduce();
        org.apache.commons.lang3.math.Fraction fraction72 = fraction36.subtract(fraction55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction55", (fraction7.compareTo(fraction55) == 0) == fraction7.equals(fraction55));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, 54);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 10);
        double double6 = fraction5.doubleValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction5", (fraction2.compareTo(fraction5) == 0) == fraction2.equals(fraction5));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (short) -32);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((int) (byte) 9);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.divideBy(fraction14);
        java.lang.String str16 = fraction15.toString();
        long long17 = fraction15.longValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.subtract(fraction15);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction10.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction21 = fraction20.invert();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.negate();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction20.subtract(fraction25);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction25.multiplyBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction31.divideBy(fraction33);
        java.lang.String str35 = fraction34.toString();
        long long36 = fraction34.longValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction30.subtract(fraction34);
        int int38 = fraction37.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.divideBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction29.divideBy(fraction40);
        int int42 = fraction11.compareTo(fraction41);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.invert();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.invert();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction44.pow((int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction48.pow(3);
        int int51 = fraction50.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction50.reduce();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction46.add(fraction50);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction46.negate();
        boolean boolean55 = fraction2.equals((java.lang.Object) fraction54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction4", (fraction2.compareTo(fraction4) == 0) == fraction2.equals(fraction4));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("5/6");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.divideBy(fraction5);
        java.lang.String str7 = fraction6.toString();
        long long8 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.subtract(fraction6);
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        int int13 = fraction11.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction1.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.negate();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction21.subtract(fraction26);
        long long28 = fraction27.longValue();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.negate();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int36 = fraction31.compareTo(fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction27.multiplyBy(fraction31);
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction39 = fraction38.invert();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction42.negate();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction38.subtract(fraction43);
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction43.multiplyBy(fraction46);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction31.subtract(fraction43);
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.invert();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction53.negate();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction49.subtract(fraction54);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction54.multiplyBy(fraction57);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction58.abs();
        java.lang.String str60 = fraction59.toProperString();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction48.subtract(fraction59);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction20.subtract(fraction48);
        long long63 = fraction20.longValue();
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.getFraction((-192), (int) (byte) -100);
        float float67 = fraction66.floatValue();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction20.subtract(fraction66);
        long long69 = fraction20.longValue();
        int int70 = fraction20.getDenominator();
        int int71 = fraction14.compareTo(fraction20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction14", (fraction2.compareTo(fraction14) == 0) == fraction2.equals(fraction14));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, 4);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((int) (short) 42);
        short short5 = fraction2.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction4", (fraction2.compareTo(fraction4) == 0) == fraction2.equals(fraction4));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 42, (int) (byte) -24);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.divideBy(fraction10);
        java.lang.String str12 = fraction11.toString();
        long long13 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction7.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction16.divideBy(fraction18);
        java.lang.String str20 = fraction19.toString();
        long long21 = fraction19.longValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction15.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction11.divideBy(fraction19);
        int int24 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction6.divideBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction1.multiplyBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double28 = fraction27.doubleValue();
        long long29 = fraction27.longValue();
        float float30 = fraction27.floatValue();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction31.divideBy(fraction33);
        java.lang.String str35 = fraction34.toString();
        int int36 = fraction34.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction34.reduce();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction39 = fraction38.invert();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.add(fraction38);
        boolean boolean41 = fraction27.equals((java.lang.Object) fraction37);
        int int42 = fraction37.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction26.add(fraction37);
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 1, (-1));
        org.apache.commons.lang3.math.Fraction fraction47 = fraction46.abs();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction50 = fraction48.multiplyBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction53.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction56 = fraction49.multiplyBy(fraction53);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction57.invert();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction61.negate();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction57.subtract(fraction62);
        long long64 = fraction63.longValue();
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction67.negate();
        org.apache.commons.lang3.math.Fraction fraction71 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int72 = fraction67.compareTo(fraction71);
        org.apache.commons.lang3.math.Fraction fraction73 = fraction63.multiplyBy(fraction67);
        java.lang.String str74 = fraction63.toProperString();
        org.apache.commons.lang3.math.Fraction fraction75 = fraction56.add(fraction63);
        boolean boolean76 = fraction47.equals((java.lang.Object) fraction56);
        org.apache.commons.lang3.math.Fraction fraction77 = fraction26.subtract(fraction56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction48", (fraction7.compareTo(fraction48) == 0) == fraction7.equals(fraction48));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("5/6");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.divideBy(fraction5);
        java.lang.String str7 = fraction6.toString();
        long long8 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.subtract(fraction6);
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        int int13 = fraction11.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction1.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction22.divideBy(fraction24);
        java.lang.String str26 = fraction25.toString();
        long long27 = fraction25.longValue();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction21.subtract(fraction25);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction20.add(fraction21);
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.reduce();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction1.multiplyBy(fraction31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction14", (fraction2.compareTo(fraction14) == 0) == fraction2.equals(fraction14));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(4, (int) '4', (int) '4');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.reduce();
        java.lang.Class<?> wildcardClass6 = fraction5.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction5", (fraction3.compareTo(fraction5) == 0) == fraction3.equals(fraction5));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.subtract(fraction1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.subtract(fraction3);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.divideBy(fraction10);
        java.lang.String str12 = fraction11.toString();
        long long13 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction7.subtract(fraction11);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.negate();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction19.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction24.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction18.divideBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction14.multiplyBy(fraction29);
        int int31 = fraction29.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getReducedFraction(8, 8);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction29.multiplyBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction6.multiplyBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (-998));
        boolean boolean40 = fraction36.equals((java.lang.Object) fraction39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction36 and fraction39", (fraction36.compareTo(fraction39) == 0) == fraction36.equals(fraction39));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.divideBy(fraction11);
        java.lang.String str13 = fraction12.toString();
        long long14 = fraction12.longValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction4.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.negate();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction20.divideBy(fraction22);
        java.lang.String str24 = fraction23.toString();
        int int25 = fraction23.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction23.reduce();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction28 = fraction27.invert();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction26.add(fraction27);
        int int30 = fraction26.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.reduce();
        double double32 = fraction26.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.negate();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction33.subtract(fraction38);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction42 = fraction40.multiplyBy(fraction41);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction45.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction48 = fraction41.multiplyBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction45.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int52 = fraction51.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction54 = fraction51.divideBy(fraction53);
        java.lang.String str55 = fraction54.toString();
        int int56 = fraction54.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction54.reduce();
        int int58 = fraction57.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction50.multiplyBy(fraction57);
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction61 = fraction59.divideBy(fraction60);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction59.pow(0);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction39.divideBy(fraction63);
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction66 = fraction65.invert();
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction69.negate();
        org.apache.commons.lang3.math.Fraction fraction71 = fraction65.subtract(fraction70);
        long long72 = fraction71.longValue();
        org.apache.commons.lang3.math.Fraction fraction75 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction75.negate();
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int80 = fraction75.compareTo(fraction79);
        org.apache.commons.lang3.math.Fraction fraction81 = fraction71.multiplyBy(fraction75);
        java.lang.String str82 = fraction71.toProperString();
        boolean boolean83 = fraction64.equals((java.lang.Object) fraction71);
        org.apache.commons.lang3.math.Fraction fraction84 = fraction26.multiplyBy(fraction64);
        org.apache.commons.lang3.math.Fraction fraction85 = fraction12.divideBy(fraction64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction40", (fraction0.compareTo(fraction40) == 0) == fraction0.equals(fraction40));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.multiplyBy(fraction1);
        java.lang.String str3 = fraction1.toString();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction12 = fraction5.multiplyBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction1.add(fraction9);
        int int16 = fraction9.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.pow(3);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction9.subtract(fraction18);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction18.negate();
        double double23 = fraction18.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -10, 8);
        boolean boolean27 = fraction18.equals((java.lang.Object) 8);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.add(fraction31);
        int int33 = fraction30.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        double double35 = fraction34.doubleValue();
        long long36 = fraction34.longValue();
        float float37 = fraction34.floatValue();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int39 = fraction38.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction38.divideBy(fraction40);
        java.lang.String str42 = fraction41.toString();
        int int43 = fraction41.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction41.reduce();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction46 = fraction45.invert();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction44.add(fraction45);
        boolean boolean48 = fraction34.equals((java.lang.Object) fraction44);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction30.add(fraction44);
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction52.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction55 = fraction54.invert();
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int58 = fraction57.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction60 = fraction57.divideBy(fraction59);
        java.lang.String str61 = fraction60.toString();
        long long62 = fraction60.longValue();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction56.subtract(fraction60);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction55.add(fraction56);
        java.lang.String str65 = fraction64.toString();
        int int66 = fraction64.getProperNumerator();
        int int67 = fraction64.intValue();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction44.add(fraction64);
        int int69 = fraction18.compareTo(fraction44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction56", (fraction0.compareTo(fraction56) == 0) == fraction0.equals(fraction56));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, 4);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((int) (short) 42);
        long long5 = fraction4.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction4", (fraction2.compareTo(fraction4) == 0) == fraction2.equals(fraction4));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        boolean boolean6 = fraction2.equals((java.lang.Object) fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.invert();
        int int8 = fraction7.getDenominator();
        java.lang.String str9 = fraction7.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.multiplyBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction15.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction15.reduce();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.negate();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.abs();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.divideBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.subtract(fraction30);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction30.multiplyBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction37.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.invert();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.invert();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction45.negate();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction41.subtract(fraction46);
        long long48 = fraction47.longValue();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction51.negate();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int56 = fraction51.compareTo(fraction55);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction47.multiplyBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction59 = fraction58.invert();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction62.negate();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction58.subtract(fraction63);
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction63.multiplyBy(fraction66);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction51.subtract(fraction63);
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction70 = fraction69.invert();
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction73.negate();
        org.apache.commons.lang3.math.Fraction fraction75 = fraction69.subtract(fraction74);
        org.apache.commons.lang3.math.Fraction fraction77 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction78 = fraction74.multiplyBy(fraction77);
        org.apache.commons.lang3.math.Fraction fraction79 = fraction78.abs();
        java.lang.String str80 = fraction79.toProperString();
        org.apache.commons.lang3.math.Fraction fraction81 = fraction68.subtract(fraction79);
        org.apache.commons.lang3.math.Fraction fraction82 = fraction40.subtract(fraction68);
        org.apache.commons.lang3.math.Fraction fraction83 = fraction34.multiplyBy(fraction68);
        int int84 = fraction21.compareTo(fraction83);
        org.apache.commons.lang3.math.Fraction fraction86 = org.apache.commons.lang3.math.Fraction.getFraction((double) 2);
        org.apache.commons.lang3.math.Fraction fraction87 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction88 = fraction87.negate();
        int int89 = fraction86.compareTo(fraction88);
        org.apache.commons.lang3.math.Fraction fraction90 = fraction21.add(fraction88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction10 and fraction87", (fraction10.compareTo(fraction87) == 0) == fraction10.equals(fraction87));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.negate();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int15 = fraction10.compareTo(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction6.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.negate();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction17.subtract(fraction22);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction22.multiplyBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction10.subtract(fraction22);
        int int28 = fraction27.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction("-3/1");
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.negate();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction30.multiplyBy(fraction31);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction27.subtract(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction36.multiplyBy(fraction37);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction44 = fraction37.multiplyBy(fraction41);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction41.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction41.reduce();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction47.negate();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction47.abs();
        java.lang.String str50 = fraction49.toString();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction49.abs();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction49.negate();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction35.divideBy(fraction49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction31 and fraction36", (fraction31.compareTo(fraction36) == 0) == fraction31.equals(fraction36));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.negate();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.multiplyBy(fraction15);
        boolean boolean19 = fraction7.equals((java.lang.Object) fraction15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction10", (fraction0.compareTo(fraction10) == 0) == fraction0.equals(fraction10));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.String str5 = fraction4.toString();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int15 = fraction14.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.multiplyBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.negate();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction19.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction24.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction24.reduce();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.reduce();
        int int31 = fraction30.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction18.multiplyBy(fraction30);
        int int33 = fraction30.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction7.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.multiplyBy(fraction36);
        java.lang.String str38 = fraction36.toString();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.multiplyBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction44.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction47 = fraction40.multiplyBy(fraction44);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction44.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction36.add(fraction44);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction36.negate();
        boolean boolean52 = fraction30.equals((java.lang.Object) fraction36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction0 and fraction36", (fraction0.compareTo(fraction36) == 0) == fraction0.equals(fraction36));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.multiplyBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.negate();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction13.multiplyBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.reduce();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.reduce();
        int int20 = fraction19.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction7.multiplyBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.negate();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction22.subtract(fraction27);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.multiplyBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction37 = fraction30.multiplyBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction34.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int41 = fraction40.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction43 = fraction40.divideBy(fraction42);
        java.lang.String str44 = fraction43.toString();
        int int45 = fraction43.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction43.reduce();
        int int47 = fraction46.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction39.multiplyBy(fraction46);
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction50 = fraction48.divideBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction48.pow(0);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction28.divideBy(fraction52);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction55 = fraction54.invert();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction58.negate();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction54.subtract(fraction59);
        long long61 = fraction60.longValue();
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction64.negate();
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int69 = fraction64.compareTo(fraction68);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction60.multiplyBy(fraction64);
        java.lang.String str71 = fraction60.toProperString();
        boolean boolean72 = fraction53.equals((java.lang.Object) fraction60);
        org.apache.commons.lang3.math.Fraction fraction73 = fraction7.multiplyBy(fraction53);
        org.apache.commons.lang3.math.Fraction fraction74 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction75 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int76 = fraction75.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction77 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction78 = fraction75.divideBy(fraction77);
        java.lang.String str79 = fraction78.toString();
        long long80 = fraction78.longValue();
        org.apache.commons.lang3.math.Fraction fraction81 = fraction74.subtract(fraction78);
        int int82 = fraction81.getNumerator();
        long long83 = fraction81.longValue();
        int int84 = fraction81.intValue();
        org.apache.commons.lang3.math.Fraction fraction85 = fraction73.add(fraction81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction29 and fraction74", (fraction29.compareTo(fraction74) == 0) == fraction29.equals(fraction74));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -10, 8);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        int int4 = fraction3.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction6", (fraction3.compareTo(fraction6) == 0) == fraction3.equals(fraction6));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.divideBy(fraction2);
        java.lang.String str4 = fraction3.toString();
        long long5 = fraction3.longValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.multiplyBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction14 = fraction7.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int18 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.divideBy(fraction19);
        java.lang.String str21 = fraction20.toString();
        int int22 = fraction20.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction20.reduce();
        int int24 = fraction23.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction16.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction3.multiplyBy(fraction23);
        int int27 = fraction26.getDenominator();
        double double28 = fraction26.doubleValue();
        long long29 = fraction26.longValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction26.abs();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int33 = fraction32.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.divideBy(fraction34);
        java.lang.String str36 = fraction35.toString();
        long long37 = fraction35.longValue();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction31.subtract(fraction35);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.invert();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction39.subtract(fraction44);
        long long46 = fraction45.longValue();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.negate();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int54 = fraction49.compareTo(fraction53);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction45.multiplyBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction57 = fraction56.invert();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction60.negate();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction56.subtract(fraction61);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction61.multiplyBy(fraction64);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction49.subtract(fraction61);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction35.divideBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        boolean boolean74 = fraction70.equals((java.lang.Object) fraction73);
        float float75 = fraction73.floatValue();
        int int76 = fraction73.getNumerator();
        int int77 = fraction73.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        long long80 = fraction79.longValue();
        int int81 = fraction73.compareTo(fraction79);
        org.apache.commons.lang3.math.Fraction fraction82 = fraction67.subtract(fraction79);
        org.apache.commons.lang3.math.Fraction fraction83 = fraction30.subtract(fraction79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction31", (fraction6.compareTo(fraction31) == 0) == fraction6.equals(fraction31));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.divideBy(fraction2);
        int int4 = fraction0.getProperWhole();
        java.lang.String str5 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction(4, 3, 6);
        java.lang.String str10 = fraction9.toProperString();
        int int11 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction0.add(fraction12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction9 and fraction12", (fraction9.compareTo(fraction12) == 0) == fraction9.equals(fraction12));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 1, (-1));
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction("2/3");
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction("2 1/2");
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction("2");
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction15.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction20.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.abs();
        java.lang.String str26 = fraction25.toProperString();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int29 = fraction28.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction31 = fraction28.divideBy(fraction30);
        java.lang.String str32 = fraction31.toString();
        long long33 = fraction31.longValue();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction27.subtract(fraction31);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int37 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction39 = fraction36.divideBy(fraction38);
        java.lang.String str40 = fraction39.toString();
        long long41 = fraction39.longValue();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction35.subtract(fraction39);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction31.divideBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        int int46 = fraction45.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction48 = fraction47.invert();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction51.negate();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction47.subtract(fraction52);
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction52.multiplyBy(fraction55);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction56.abs();
        boolean boolean58 = fraction45.equals((java.lang.Object) fraction57);
        boolean boolean59 = fraction39.equals((java.lang.Object) fraction45);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction25.add(fraction39);
        int int61 = fraction60.getNumerator();
        boolean boolean62 = fraction12.equals((java.lang.Object) fraction60);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction9.divideBy(fraction12);
        int int64 = fraction4.compareTo(fraction12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction34", (fraction6.compareTo(fraction34) == 0) == fraction6.equals(fraction34));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        java.lang.String str11 = fraction10.toString();
        long long12 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction6);
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction14.negate();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction27.negate();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction23.subtract(fraction28);
        long long30 = fraction29.longValue();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.negate();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) ' ');
        int int38 = fraction33.compareTo(fraction37);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction29.multiplyBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction40.invert();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction44.negate();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction40.subtract(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction45.multiplyBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction33.subtract(fraction45);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction51.invert();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction55.negate();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction51.subtract(fraction56);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction56.multiplyBy(fraction59);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction60.abs();
        java.lang.String str62 = fraction61.toProperString();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction50.subtract(fraction61);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction22.subtract(fraction50);
        int int65 = fraction14.compareTo(fraction64);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction64.negate();
        int int67 = fraction64.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction64.pow(3);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction64.abs();
        org.apache.commons.lang3.math.Fraction fraction71 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction73 = fraction71.multiplyBy(fraction72);
        org.apache.commons.lang3.math.Fraction fraction76 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction78 = fraction76.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction79 = fraction72.multiplyBy(fraction76);
        int int80 = fraction72.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction81 = fraction64.divideBy(fraction72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction72", (fraction6.compareTo(fraction72) == 0) == fraction6.equals(fraction72));
    }
}

